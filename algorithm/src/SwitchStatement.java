import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        Random random = new Random();

        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.


        int randomInt = random.nextInt(6) + 5;
        System.out.println("Randomn Number is: " + randomInt);

        switch(randomInt) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("vallah nix gut");

        }
    }
}
