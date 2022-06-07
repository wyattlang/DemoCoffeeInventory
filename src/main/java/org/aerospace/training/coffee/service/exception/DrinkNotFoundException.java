package org.aerospace.training.coffee.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DrinkNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8995825761970274531L;
	
}
