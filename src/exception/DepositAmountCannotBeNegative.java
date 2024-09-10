package exception;

public class DepositAmountCannotBeNegative extends RuntimeException {
    public DepositAmountCannotBeNegative(String message) {
        super(message);
    }
}
