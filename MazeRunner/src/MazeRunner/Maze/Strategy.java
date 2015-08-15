package MazeRunner.Maze;

public interface Strategy {

	//Gets current point in map, and returns location of next Point. 
	public Point getNextPos(Point curPos);
}
