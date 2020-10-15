package mazeProject;

public class Solver{
	
	Maps currentMap;
	
	public Solver(Maps map) {
		currentMap = map;
	}

	public boolean validPos(int y, int x) {
		
		if(y < 0 || y >= currentMap.map.length || x < 0 || x >= currentMap.map[y].length ) {
			return false;
		}
		return true;
	}
	
	public void mazeSolver() {
		while(true) {
			int x = currentMap.walkthrough.peek().x;
			int y = currentMap.walkthrough.peek().y;
			currentMap.map[y][x] = 0;
			//Move Down
			if (validPos(y+1, x)) {
				if (currentMap.map[y+1][x] == 2) {
					System.out.println("Moved down, found it!");
					return;
				} else if (currentMap.map[y+1][x] == 1) {
					System.out.println("Moved down");
					currentMap.walkthrough.push(new Position(y+1, x));
					continue;
				}
			}
			//Move left
			if(validPos(y, x-1)) {
				if (currentMap.map[y][x-1] == 2) {
					System.out.println("Moved left, found it!");
					return;
				} else if (currentMap.map[y][x-1] == 1) {
					System.out.println("Moved left");
					currentMap.walkthrough.push(new Position(y, x-1));
					continue;
				}
			}
			//Move right
			if (validPos(y, x+1)) {
				if (currentMap.map[y][x+1] == 2) {
					System.out.println("Moved right, found it!");
					return;
				} else if (currentMap.map[y][x+1] == 1) {
					System.out.println("Moved right");
					currentMap.walkthrough.push(new Position(y, x+1));
					continue;
				}
			}
			//Move up
			if(validPos(y-1, x)) {
				if (currentMap.map[y-1][x] == 2) {
					System.out.println("Moved Up, found it!");
					return;
				} else if (currentMap.map[y-1][x] == 1) {
					System.out.println("Moved up");
					currentMap.walkthrough.push(new Position(y-1, x));
					continue;
				} 
			}
			currentMap.walkthrough.pop();
			System.out.println("moved back");
			if(currentMap.walkthrough.size() <= 0) {
				System.out.println("There is no path");
				return;
			}
		}
	}
}
