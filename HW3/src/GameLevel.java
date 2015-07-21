
public abstract class GameLevel {
	
	
	public GameLevel(){}
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	final void play(){
		System.out.print("level" + Player.getGameLevel() + " simple attack : ");
		simpleAttack();
		System.out.print("\nlevel" + Player.getGameLevel() + " turn attack : ");
		turnAttack();
		System.out.print("\nlevel" + Player.getGameLevel() + " flying attack : ");
		flyingAttack();
	}
}
