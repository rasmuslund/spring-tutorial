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

    @Around("@annotation(dk.ralu.springtutorial.aop.Timed) || @within(dk.ralu.springtutorial.aop.Timed)")
    public Object timeCalls(ProceedingJoinPoint joinPoint) throws Throwable {

        String timingName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "()";

        Timing timing = Timing.startNewTiming(timingName);

        Object result = joinPoint.proceed();

        timing.finished();

        timingEmitter.emitTiming(timing);

        return result;
    }
}
