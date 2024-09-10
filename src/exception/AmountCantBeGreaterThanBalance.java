package exception;

public class AmountCantBeGreaterThanBalance extends RuntimeException {
    public AmountCantBeGreaterThanBalance(String message) {
        super(message);
    }
}
