package dk.ralu.springtutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimingAspect {

    @Autowired
    private TimingEmitter timingEmitter;

    // All methods annotated with @Timed or within a class annotated with @Timed
    @Around("@annotation(dk.ralu.springtutorial.aop.Timed) || @within(dk.ralu.springtutorial.aop.Timed)")
    public Object timeCalls(ProceedingJoinPoint joinPoint) throws Throwable {

        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        // A real version should include args as well
        // Object[] args = joinPoint.getArgs();

        String timingName = typeName + "." + methodName + "()";

        Timing timing = Timing.startNewTiming(timingName);

        Object result = joinPoint.proceed();

        timing.finished();

        timingEmitter.emitTiming(timing);

        return result;
    }

}
