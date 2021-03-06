package MazeRunner.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import MazeRunner.Player;
import MazeRunner.Maze.Strategy;
import MazeRunner.Maze.Strategy4;
import MazeRunner.Maze.Strategy8;

public class MazeTest {

	public static void main(String args[]) throws IOException{
		
		Strategy strategies[] = new Strategy[2];
		strategies[0] = new Strategy4();
		strategies[1] = new Strategy8();
		
		// Read properties file.
		String path = MazeTest.class.getResource("").getPath();
		Properties properties = new Properties();
		properties.load(new FileInputStream(path + "config.properties"));
		String direction = properties.getProperty("direction");
		System.out.println("direction: " + direction);
		   
		Player player = null;
		if(direction.equals("4"))
			player = new Player(strategies[0]);
		else if(direction.equals("8"))
			player = new Player(strategies[1]);
		
		player.searchPath();
		player.printPath();
		
		
	}
}
