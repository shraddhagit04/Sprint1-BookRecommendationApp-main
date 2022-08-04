package com.cg.book.app.exception;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class AuthorNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public AuthorNotFoundException() {
		super();
	}

	public AuthorNotFoundException(String message) {
		super(message);

	}
}
