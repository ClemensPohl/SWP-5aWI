public class SortingAlgorithm {
    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {  // voriges value kleiner?
                    System.out.println();
                    temp = array[j - 1]; // vorige zahl speichern
                    array[j-1] = array[j]; // vorige zahl auf derzeitige zahl setzen
                    array[j]= temp; // derzeitige auf vorige ->> swap
                }
            }
        }
        return array;
    }
}
