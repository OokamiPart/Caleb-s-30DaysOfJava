package mazeProject;

import java.util.LinkedList;

public class Maze {
	
	static int[][] map = {
			{0, 0, 0, 0, 0, 0},
			{0, 1, 0, 2, 1, 0},
			{0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0},
	};
	
	static LinkedList<Position> path = new LinkedList<Position>();

	public static void main(String[] args) {
		Position currentPos = new Position(1, 1);
		path.push(currentPos);
		while(true) {
			int x = path.peek().x;
			int y = path.peek().y;
			map[y][x] = 0;
			//Move Down
			if (map[y+1][x] == 2) {
				System.out.println("Moved down, found it!");
				return;
			} else if (map[y+1][x] == 1) {
				System.out.println("Moved down");
				path.push(new Position(y+1, x));
				continue;
			} else if (map[y+1][x] == 0) {
				System.out.println("Blocked, Cant Move down");
				return;
			}
		}
	}
}
