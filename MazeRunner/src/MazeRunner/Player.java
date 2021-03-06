package MazeRunner;

import java.util.ArrayList;

import MazeRunner.Maze.Map;
import MazeRunner.Maze.Point;
import MazeRunner.Maze.Strategy;

public class Player {
	private ArrayList<Point> path = new ArrayList<Point>();
	private Map map;
	private int accessedPoints[][];
	private Strategy strategy;
	private int mapSize;

	public Player(Strategy strategy){
		this.strategy = strategy;
		map = new Map();
		mapSize = map.getMapSize();
		map.setMap();
		accessedPoints = new int[mapSize][mapSize];//모두 0으로 초기화.
	}
	
	public ArrayList<Point> searchPath(){
		Point curPos = new Point();
		Point nextPos = null;
		curPos.x = 0;
		curPos.y = 0;
		
		//Continue until we get to the exit.
		while(!map.isExit(curPos)){
			//get next direction
			do{nextPos = strategy.getNextPos(curPos); 
			}while( !canIGo(nextPos) && curPos.nextDir != -1 );
			
			//if nextDir is -1, which means this is dead end, 
			if(curPos.nextDir == -1){
				curPos = path.get(path.size() - 1);//set curPos to the point we passed right before
				path.remove(path.size() - 1);//and remove current position from the path
				continue;
			}
			
			//restore passed points, and check we have passed
			path.add(curPos);
			accessedPoints[curPos.y][curPos.x] = 1;
			curPos = nextPos;
				
		}
		path.add(curPos);
		System.out.println("Found Path!\n");
		return path;
	}
	
	private boolean canIGo(Point point){
		
		//is out of range
		if(point.x < 0 || point.x >= mapSize)
			return false;
		
		if(point.y < 0 || point.y >= mapSize)
			return false;
		
		
		//already in the path,
		if(accessedPoints[point.y][point.x] == 1)
			return false;
		
		
		//is wall
		if(map.getLocInfo(point) == 1)
			return false;
		
		return true;
	}
	
	public void printPath(){
		
		System.out.println("길에 쓰인 숫자는 시계방향으로 위쪽을 0으로 하는 방향을 나타내는 숫자이며, 다음 이동 위치를 나타냅니다.");
		System.out.println("W는 벽을, X는 길도, 벽도 아닌 점들을 나타냅니다.");
		String result[][] = new String[mapSize][mapSize];
		
		for(int i = 0; i < mapSize; i++){
			for(int j = 0; j < mapSize; j++){
				Point pos = new Point();
				pos.x = j;
				pos.y = i;
				if(map.getLocInfo(pos) == 1)
					result[i][j] = "W";
				if(map.getLocInfo(pos) == 0)
					result[i][j] = "X";
			}
		}
		
		for(int i = 0; i < path.size(); i++){
			Point pos = path.get(i);
			
			if(i == 0)
				result[pos.y][pos.x] = "S";
			
			else if(i == path.size() - 1)
				result[pos.y][pos.x] = "G";
			
			else
				result[pos.y][pos.x] = Integer.toString(pos.nextDir - 1);
		}
		
		for(int i = 0; i < mapSize; i++){
			System.out.println();
			for(int j = 0; j < mapSize; j++){
				System.out.print(result[i][j] + " ");
			}
		}
	}
}
