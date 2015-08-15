package MazeRunner.Maze;

public class Map {
	private int mapSize = 8;
	private int map[][] = null;
	
	
	public int getLocInfo(Point pos){
		return map[pos.y][pos.x];
	}
	
	public boolean isExit(Point pos){
		if(pos.x == 7 && pos.y == 7)
			return true;
		return false;
	}
	
	public void setMap(){
		map = new int[mapSize][];
		map[0] = new int[] {0, 1, 1, 1, 0, 1, 1, 1};
		map[1] = new int[] {0, 0, 0, 1, 0, 0, 0, 0};
		map[2] = new int[] {1, 1, 0, 0, 0, 1, 0, 1};
		map[3] = new int[] {1, 1, 0, 1, 1, 1, 0, 1};
		map[4] = new int[] {1, 0, 0, 1, 0, 0, 0, 0};
		map[5] = new int[] {0, 1, 1, 1, 0, 1, 1, 1};
		map[6] = new int[] {1, 0, 1, 1, 0, 0, 0, 0};
		map[7] = new int[] {0, 1, 1, 0, 1, 1, 1, 0};
	}
	
	public int getMapSize(){
		return mapSize;
	}
}
