import java.util.Random;

public class IfConditions {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        int randomNum0 = random.nextInt(100);


        // If conditions a1
        if(randomNum < 20){
            System.out.println("Mini");
        }

        if(20 < randomNum && randomNum < 50){
            System.out.println("Medium");
        }

        if(randomNum > 50){
            System.out.println("Large");
        }

        // If conditions a2

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if(randomNum < randomNum0 && randomNum < 50){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }
        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        if(randomNum < 40 || randomNum0 < 30){
            System.out.println("Eine der beiden ist kleiner als 30");
        }
        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        if(randomNum < 50 && randomNum0 != 50){
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
