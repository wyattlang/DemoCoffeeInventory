package org.aerospace.training.coffee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DrinkControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleException(Exception dnfe) {
		return ResponseEntity.status(404)
				.body(new ExceptionResponse(dnfe.getMessage(), 404));
	}
	
	public static class ExceptionResponse {
		
		private String message;
		private int statusCode;
		
		ExceptionResponse() {
			
		}
		
		ExceptionResponse(String message, int statusCode) {
			super();
			this.message = message;
			this.statusCode = statusCode;
		}
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		
	}
	
}
