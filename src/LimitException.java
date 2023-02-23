public class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount(){
        return remainingAmount;
    }
}
