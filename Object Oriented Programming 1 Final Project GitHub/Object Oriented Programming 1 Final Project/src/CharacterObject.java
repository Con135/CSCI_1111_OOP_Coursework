
public abstract class CharacterObject {

	protected CharacterObject() {
	}
//Main stats
	public abstract int getMaxHealth();
	public abstract int getHealth();
	public abstract int getMaxEnergy();
	public abstract int getEnergy();
	public abstract int getAttackStat();
	public abstract int getDefenseStat();
	
//Move group A
	public abstract String getMoveDefA1();
	public abstract int getMoveA1();
	public abstract String getMoveDefA2();
	public abstract int getMoveA2();
	
//Move group B
	public abstract String getMoveDefB1();
	public abstract int getMoveB1();
	public abstract String getMoveDefB2();
	public abstract int getMoveB2();
	
//Move group C
	public abstract String getMoveDefC1();
	public abstract int getMoveC1();
	public abstract String getMoveDefC2();
	public abstract int getMoveC2();
	
//Move group D	
	public abstract String getMoveDefD1();
	public abstract int getMoveD1();
	public abstract String getMoveDefD2();
	public abstract int getMoveD2();
	
//Move group E	
	public abstract String getMoveDefE1();
	public abstract int getMoveE1();
	public abstract String getMoveDefE2();
	public abstract int getMoveE2();
}