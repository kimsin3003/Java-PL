package Game;


public class GameLevel2 extends GameLevel {
	
private static GameLevel2 level2 = new GameLevel2();
	
	private GameLevel2(){}
	
	public static GameLevel2 getInstance(){
		if(level2 == null)
			level2 = new GameLevel2();
		return level2;
	}

	@Override
	public void simpleAttack() {
		System.out.println("툭");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("툭 툭");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("쪼렙이 어디서..");
	}
}
