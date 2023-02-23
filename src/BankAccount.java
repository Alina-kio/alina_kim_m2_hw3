public class BankAccount {
    private Double amount;

    public BankAccount(Double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public void deposit(Double sum){
        amount = amount + sum;
        System.out.println("you put  " + sum + " to your score");
    }

    public void withDraw(Integer sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("На вашем счете недостаточно средств", amount);
        }else{
            amount = amount - sum;
            System.out.println("Вы сняли со счета " + sum + " сом");
        }
    }
}
