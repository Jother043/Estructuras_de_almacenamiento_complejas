package Exceptions;

public class AlumnosValuesExceptions extends Exception{
    public AlumnosValuesExceptions() {
    }

    public AlumnosValuesExceptions(String message) {
        super(message);
    }

    public AlumnosValuesExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public AlumnosValuesExceptions(Throwable cause) {
        super(cause);
    }

    public AlumnosValuesExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
