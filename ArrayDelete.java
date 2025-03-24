import java.util.Arrays;
import java.util.Scanner;
public class ArrayDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		System.out.println("enter your array size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) 
		   {
			arr[i]=sc.nextInt();
		   }
		for(int i=0;i<size;i++) 
		   {
			System.out.println(arr[i]+" ");
		   }
		System.out.println("enter your position to delete:");
		int del=sc.nextInt();
		for(int pos=del-1;pos<size;pos++)
		   {
			arr[pos]=arr[pos+1];
		   }
		size--;
		System.out.println(Arrays.toString(arr));
		}
	}
