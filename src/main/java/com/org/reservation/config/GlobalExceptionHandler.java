package com.org.reservation.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.org.reservation.model.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ApiResponse handlerException(Exception ex) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setResponseCode(1);
		apiResponse.setResponseMsg(ex.getMessage());
		return apiResponse;
	}
}
