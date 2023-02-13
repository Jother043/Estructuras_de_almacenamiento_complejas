package Exceptions;

public class ExceptionEquipo extends Exception{
    public ExceptionEquipo() {
    }

    public ExceptionEquipo(String message) {
        super(message);
    }

    public ExceptionEquipo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionEquipo(Throwable cause) {
        super(cause);
    }

    public ExceptionEquipo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
