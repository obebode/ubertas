package com.ubertas.exception;


public class CountryIsoCodeNotFound extends RuntimeException {

    public CountryIsoCodeNotFound() {
        super();
    }

    public CountryIsoCodeNotFound(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CountryIsoCodeNotFound(final String message) {
        super(message);
    }

    public CountryIsoCodeNotFound(final Throwable cause) {
        super(cause);
    }

}
