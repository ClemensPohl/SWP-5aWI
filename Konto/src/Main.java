import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Girokonto g = new Girokonto(1000);
        Kreditkonto k = new Kreditkonto();
        LaendleGirokonto l = new LaendleGirokonto();

        k.deposit(10000);
        k.withdraw(100);

        l.deposit(100);
        l.withdraw(100);



    }
}