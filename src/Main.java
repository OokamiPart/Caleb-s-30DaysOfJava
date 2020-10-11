import java.util.Scanner;

public class Main {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Determine the Array Size : ");
		size = scan.nextInt();
		
		int[] arrayValue = new int[size];
		
		for(int i = 0; i < size; i++) {
			int value;
			System.out.println("Input the value : ");
			value = scan.nextInt();
			arrayValue[i] = value;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println("value of Array index " + i + " is "+ arrayValue[i]);
		}
		scan.close();
	}
}
