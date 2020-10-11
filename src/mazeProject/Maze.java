package mazeProject;

import java.util.LinkedList;

public class Maze {
	
	static int[][] map = {
			{1, 0, 1, 1},
			{1, 0, 0, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	
	static LinkedList<Position> path = new LinkedList<Position>();

	public static void main(String[] args) {
		Position currentPos = new Position(0, 0);
		path.push(currentPos);
		
		map[path.peek().y][path.peek().x] = 0;
	}
}
