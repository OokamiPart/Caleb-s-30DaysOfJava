package mazeProject;

import java.util.LinkedList;

public class Maze {
	
	static int[][] map = {
			{2, 1, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 1},
			{0, 1, 0, 0, 0, 1},
			{1, 1, 1, 0, 1, 1},
	};
	
	static LinkedList<Position> path = new LinkedList<Position>();

	public static boolean validPos(int y, int x) {
		if(y < 0 || y >= map.length || x < 0 || x >= map[y].length ) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Position currentPos = new Position(1, 1);
		path.push(currentPos);
		while(true) {
			int x = path.peek().x;
			int y = path.peek().y;
			map[y][x] = 0;
			//Move Down
			if (validPos(y+1, x)) {
				if (map[y+1][x] == 2) {
					System.out.println("Moved down, found it!");
					return;
				} else if (map[y+1][x] == 1) {
					System.out.println("Moved down");
					path.push(new Position(y+1, x));
					continue;
				}
			}
			//Move left
			if(validPos(y, x-1)) {
				if (map[y][x-1] == 2) {
					System.out.println("Moved left, found it!");
					return;
				} else if (map[y][x-1] == 1) {
					System.out.println("Moved left");
					path.push(new Position(y, x-1));
					continue;
				}
			}
			//Move right
			if (validPos(y, x+1)) {
				if (map[y][x+1] == 2) {
					System.out.println("Moved right, found it!");
					return;
				} else if (map[y][x+1] == 1) {
					System.out.println("Moved right");
					path.push(new Position(y, x+1));
					continue;
				}
			}
			//Move up
			if(validPos(y-1, x)) {
				if (map[y-1][x] == 2) {
					System.out.println("Moved Up, found it!");
					return;
				} else if (map[y-1][x] == 1) {
					System.out.println("Moved up");
					path.push(new Position(y-1, x));
					continue;
				} 
			}
			path.pop();
			System.out.println("moved back");
			if(path.size() <= 0) {
				System.out.println("There is no path");
				return;
			}
		}		
	}
}
