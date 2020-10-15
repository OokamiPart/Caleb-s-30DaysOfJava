package mazeProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MazeReader {
	Position start;
	int[][] map;
	int rows;
	int y;
	int x;
	public void reader() throws FileNotFoundException{
		Scanner scanMaze = new Scanner(new File("mazes.txt"));
		rows = Integer.parseInt(scanMaze.nextLine());
		map = new int[rows][];
		for(int i = 0; i < rows; i++) {
			String line = scanMaze.nextLine();
			map[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();	
		}
		y = Integer.parseInt(scanMaze.nextLine());
		x = Integer.parseInt(scanMaze.nextLine());
		start = new Position(y, x);
	}
}