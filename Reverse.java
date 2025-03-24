import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
       
        int[] a = new int[n];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        
        reverseArray(a);
        
        
        System.out.println("Reversed array: " + Arrays.toString(a));
        
        
        sc.close();
    }

    public static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    }
}