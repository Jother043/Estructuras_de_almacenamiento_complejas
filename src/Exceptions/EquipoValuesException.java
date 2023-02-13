package Exceptions;

public class EquipoValuesException extends Exception{
    public EquipoValuesException() {
    }

    public EquipoValuesException(String message) {
        super(message);
    }

    public EquipoValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public EquipoValuesException(Throwable cause) {
        super(cause);
    }

    public EquipoValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
