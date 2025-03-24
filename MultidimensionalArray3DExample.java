import java.util.Scanner;

public class MultidimensionalArray3DExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of layers: ");
        int layers = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();


        int[][][] array = new int[layers][rows][cols];


        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print("Element at [" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }


        System.out.println("The 3D array is:");
        for (int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    sum += array[i][j][k];
                }
            }
        }
        System.out.println("The sum of all elements in the 3D array is: " + sum);


        scanner.close();
    }
}