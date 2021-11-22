package com.sfdevs.inventory.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sfdevs.inventory.exception.ObjectNotFoundException;
import com.sfdevs.inventory.model.ApiMessage;

@ControllerAdvice
public class ApiExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);
	
	@ResponseBody
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiMessage handleException(ObjectNotFoundException exception) {
		return ApiMessage.of(HttpStatus.NOT_FOUND, exception.getLocalizedMessage());
	}
}
