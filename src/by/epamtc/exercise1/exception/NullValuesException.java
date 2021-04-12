package by.epamtc.exercise1.exception;

public class NullValuesException extends Exception {

    public NullValuesException() {
    }

    public NullValuesException(String message) {
        super(message);
    }

    public NullValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullValuesException(Throwable cause) {
        super(cause);
    }

}
