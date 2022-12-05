public class Girokonto extends Sparbuch {

private int limit;

    public Girokonto(int limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double decreaseAmount) {
        if((getAmount() - decreaseAmount) > (limit * -1)){
            System.out.println("Withdraw" + decreaseAmount + " Euros");
            return super.withdraw(decreaseAmount);
        }else{
            System.out.println("Leider keine Deckung");
            return 0;
        }
    }
}
