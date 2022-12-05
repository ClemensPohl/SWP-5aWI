public class LaendleGirokonto extends Sparbuch {
    @Override
    public double withdraw(double decreaseAmount) {
        if((getAmount() - decreaseAmount) > 100){
            System.out.println("Paaast");
            return super.withdraw(decreaseAmount);
        }else{
            System.out.println("Leider keine Deckung");
            return 0;
        }
    }
}
