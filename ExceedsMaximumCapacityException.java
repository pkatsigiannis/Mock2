public class ExceedsMaximumCapacityException extends Exception {

        public ExceedsMaximumCapacityException() {
        super();
    }
        
        public ExceedsMaximumCapacityException(String message) {
        super(message);
    }

    public ExceedsMaximumCapacityException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceedsMaximumCapacityException(Throwable cause) {
        super(cause);
    }
}
