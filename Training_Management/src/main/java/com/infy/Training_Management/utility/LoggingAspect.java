package com.infy.Training_Management.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);

	@AfterThrowing(pointcut = "execution(* com.infy.Training_Management.service.*Impl.*(..))", throwing = "exception")
	public void logServiceException(Exception exception){
		LOGGER.error(exception.getMessage(), exception);
	}

}
