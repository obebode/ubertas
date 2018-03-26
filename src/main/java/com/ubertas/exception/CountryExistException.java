package com.ubertas.exception;


public class CountryExistException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366287163L;

    public CountryExistException() {
        super();
    }

    public CountryExistException(final String message) {
        super(message);
    }

}
