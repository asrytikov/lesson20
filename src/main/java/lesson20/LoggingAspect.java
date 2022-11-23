package lesson20;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Start method " + methodName + " parameters: "+ Arrays.asList(arguments));
        Object returnByMethod = joinPoint.proceed();
        logger.info("Finish method " + returnByMethod);
        return returnByMethod;
    }

  /*  @Before()
    @AfterReturning
    @AfterThrowing
    @After()*/

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
