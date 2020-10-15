package mazeProject;

import java.util.ArrayList;

public class Maze {
	
	public static void main(String[] args) {
		
		ArrayList<Maps> maps = new ArrayList<Maps>();
		Position start = new Position(1,1);
		int[][] map1 = {
				{2, 1, 1, 0, 0, 0},
				{0, 0, 1, 1, 1, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 1, 1, 1, 1, 1},
				{0, 1, 0, 0, 0, 1},
				{1, 1, 1, 0, 1, 1},
		};
		
		int[][] map2 = {
				{2, 1, 1, 0, 0, 0},
				{0, 0, 1, 1, 1, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 1, 1, 1, 1, 1},
				{0, 1, 0, 0, 0, 1},
				{1, 1, 1, 0, 1, 1},
		};
		Maps maps1 = new Maps(start);
		maps1.map = map1;
		Maps maps2 = new Maps(start);
		maps2.map = map2;
		
		maps.add(maps1);
		maps.add(maps2);
		
		int i = 0;
		while (i < maps.size()) {
		Solver solver = new Solver(maps.get(i));
		solver.mazeSolver();
		i++;
		}
	}
}
