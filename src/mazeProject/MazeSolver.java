package mazeProject;

import java.io.FileNotFoundException;

public class MazeSolver {
	
	public static void main(String[] args) throws FileNotFoundException {
		MazeReader read = new MazeReader();
		read.readers();
		
		Solver solver = new Solver(read.maps);
		solver.multiMazeSolver();		
	}
}
