public class Sparbuch {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double withdraw(double decreaseAmount){
        this.amount -= decreaseAmount;
        return decreaseAmount;
    }

    public void deposit(double increaseAmount){
        this.amount += increaseAmount;
    }

}
