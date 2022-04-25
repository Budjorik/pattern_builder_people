public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String value) {
        super(String.format(value));
    }
}
