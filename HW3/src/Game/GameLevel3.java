
public class GameLevel3 extends GameLevel {

private static GameLevel3 level3 = new GameLevel3();
	
	private GameLevel3(){}
	
	public static GameLevel3 getInstance(){
		if(level3 == null)
			level3 = new GameLevel3();
		return level3;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("탁");
		
	}

	@Override
	public void turnAttack() {
		System.out.println("탁 탁");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("탁 탁 탁");
	}
}
