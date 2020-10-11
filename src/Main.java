import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main (String [] args) throws Exception{
		Scanner scan = new Scanner(new File("name.txt"));
		
		LinkedList<String> FIFO = new LinkedList<String>();
		LinkedList<String> FILO = new LinkedList<String>();
		int size;
		
		while(scan.hasNext()){
			String name = scan.nextLine();
			FIFO.add(name);
			FILO.push(name);
			System.out.println(name + " added");
		}
		
		size = FIFO.size();
		
		if(FIFO.size() <= 0) size = FILO.size();
		
		Iterator<String> iteratorFIFO = FIFO.iterator();
		Iterator<String> iteratorFILO = FILO.iterator();
		
		System.out.println("=== FIFO OUTPUT ===");
		while(iteratorFIFO.hasNext()) {
			System.out.println(iteratorFIFO.next());
		}
		System.out.println("=== FILO OUTPUT ===");
		while(iteratorFILO.hasNext()) {
			System.out.println(iteratorFILO.next());
		}
		
	}
}
