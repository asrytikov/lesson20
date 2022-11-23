package lesson201;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class SecurityAspect {
    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Start security method ");
        Object returnByMethod = joinPoint.proceed();
        logger.info("Finish security method " + returnByMethod);
        return returnByMethod;
    }

}
