import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Enter the elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        System.out.print("Reversed array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}