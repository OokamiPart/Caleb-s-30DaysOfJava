import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main (String [] args) throws Exception{
		Scanner read = new Scanner(new File("name.txt"));
		while(read.hasNextLine()) {
			System.out.println(read.nextLine());
		}
	}
}
