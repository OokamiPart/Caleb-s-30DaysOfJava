import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main (String [] args) throws Exception{
		Scanner scan = new Scanner(new File("name.txt"));
		
		LinkedList<String> FIFO = new LinkedList();
		LinkedList<String> FILO = new LinkedList();
		int size;
		
		while(scan.hasNext()){
			String name = scan.nextLine();
			FIFO.add(name);
			FILO.push(name);
			System.out.println(name + " added");
		}
		
		size = FIFO.size();
		
		if(FIFO.size() <= 0) size = FILO.size();
		
		System.out.println("=== FIFO OUTPUT ===");
		for(int i = 0; i < size; i++) {
			System.out.println(FIFO.remove());
		}
		System.out.println("=== FILO OUTPUT ===");
		for(int i = 0; i < size; i++) {
			System.out.println(FILO.remove());
		}
		
	}
}
