package mazeProject;

import java.util.LinkedList;

public class Maps {
	int[][] map;
	LinkedList<Position> walkthrough = new LinkedList<Position>();
	public Maps(Position position) {
		walkthrough.push(position);
	}

}
