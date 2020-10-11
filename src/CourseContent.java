import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class CourseContent {
	public static void main (String [] args) throws Exception{
		Scanner scan = new Scanner(new File("name.txt"));
		
		LinkedList<String> FIFO = new LinkedList<String>();
		LinkedList<String> FILO = new LinkedList<String>();
		
		while(scan.hasNext()){
			String name = scan.nextLine();
			FIFO.add(name);
			FILO.push(name);
			System.out.println(name + " added");
		}
		System.out.println("=== FIFO OUTPUT ===");
		for(String s : FIFO) {
			System.out.println(s);
		}
		System.out.println("=== FILO OUTPUT ===");
		for(String s : FILO) {
			System.out.println(s);
		}
	}
}
