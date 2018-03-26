package com.ubertas.exception;

public class CountryNotFoundException extends RuntimeException {

    private long id;

    public CountryNotFoundException() {
        super();
    }

   /* public CountryNotFoundException(long id) {
        super();
        this.id = id;
    }*/

    public long getId() {
        return id;
    }

    public CountryNotFoundException(final String message) {
        super(message);
    }
    public CountryNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
