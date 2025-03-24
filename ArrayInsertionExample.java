import java.util.Arrays;

public class ArrayInsertionExample {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 99;
        int position = 2;

    
        int[] newArray = new int[originalArray.length + 1];


        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }

        newArray[position] = elementToInsert;

        for (int i = position; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}