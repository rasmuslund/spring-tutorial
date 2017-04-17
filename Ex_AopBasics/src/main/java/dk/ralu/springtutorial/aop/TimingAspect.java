package dk.ralu.springtutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Specifies that this is an ASPECT
@Aspect
// Makes sure Spring activates this aspect (an aspect is just a special type of Spring bean)
@Component
public class TimingAspect {

    // As an aspect is just a special kind of Spring bean, we can inject stuff into it
    @Autowired
    private TimingEmitter timingEmitter;

    // The String in this annotation it the POINTCUT
    // All methods annotated with @Timed or within a class annotated with @Timed
    @Around("@annotation(dk.ralu.springtutorial.aop.Timed) || @within(dk.ralu.springtutorial.aop.Timed)")
    // The code inside this method is the ADVICE
    public Object timeCalls(ProceedingJoinPoint joinPoint) throws Throwable {

        // What should happen BEFORE the actual bean method is called (can modify args if you want to)

        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        // A real version should include args as well
        // Object[] args = joinPoint.getArgs();

        String timingName = typeName + "." + methodName + "()";

        Timing timing = Timing.startNewTiming(timingName);

        // FORWARDS the call to the actual bean method (remember to hold onto the result from the bean method)
        // You don't have to forward to the bean method (e.g. if security aspect block the user, of if a caching aspect has the value)
        Object result = joinPoint.proceed();

        // What should happen AFTER the actual bean method has been called

        timing.finished();

        timingEmitter.emitTiming(timing);

        // Remember to return the result from the business method (you may modify the result if you want to)
        return result;
    }

}
