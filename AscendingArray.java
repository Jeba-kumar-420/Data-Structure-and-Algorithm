import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int[] arr = new int[sc.nextInt()];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        sc.close();
    }
}