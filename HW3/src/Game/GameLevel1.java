package Game;


public class GameLevel1 extends GameLevel {

	private static GameLevel1 level1 = new GameLevel1();
	private GameLevel1(){}
	
	public static GameLevel1 getInstance(){
		if(level1 == null)
			level1 = new GameLevel1();
		return level1;
	}

	@Override
	public void simpleAttack() {
		System.out.println("톡");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("쪼렙이 어디서..");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("쪼렙이 어디서..");
	}

}
