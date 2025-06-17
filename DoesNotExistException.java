
public class DoesNotExistException extends Exception {

    public DoesNotExistException(String message) {
        super(message);
    }

    public DoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoesNotExistException(Throwable cause) {
        super(cause);
    }
}
