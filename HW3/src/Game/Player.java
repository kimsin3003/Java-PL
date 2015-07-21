package Game;

import java.util.ArrayList;

public class Player {
	private static int level;
	private ArrayList<GameLevel> levels;
	
	
	public Player(){
		level = 0;
		levels = new ArrayList<GameLevel>();
		levels.add(GameLevel1.getInstance());
		levels.add(GameLevel2.getInstance());
		levels.add(GameLevel3.getInstance());
	}
	
	void upgradeLevel(){
		level++;
	}
	static int getGameLevel(){
		return level+1;
	}
	
	void attack(){
		System.out.println("========level" + (level+1) + " start===========");
		levels.get(level).play();
		System.out.println("========level" + (level+1) + " end=============\n\n");
	}
	
}