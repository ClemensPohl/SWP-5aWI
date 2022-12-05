import java.util.Random;

public class Datatypes {
    public static void main(String[] args) {

    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " IndexNumber: " + i);
        }
    }

    public static int[] GenerateArray(int size) {
        int[] data = new int[size];
        Random randomnum = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = randomnum.nextInt(100);
        }
        return data;
    }
}
