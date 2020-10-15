package mazeProject;

import java.io.FileNotFoundException;

public class MazeSolver {
	
	public static void main(String[] args) throws FileNotFoundException {
		MazeReader read = new MazeReader();
		read.reader();
		Maps map = new Maps(read.start);
		map.map = read.map;
		
		Solver solver = new Solver(map);
		solver.mazeSolver();		
	}
}
