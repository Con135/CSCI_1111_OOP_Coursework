
public class EnemyTemplate extends CharacterObject{
//This is used to create enemies, you just have to input the information
//Enemies don't use energy
	
//Main stats
	private double maxHealth = 0;
	private double health = 0;
	private int maxEnergy = 0;
	private int energy = 0;
	private int attackStat = 0;
	private int defenseStat = 0;	
//Move group A
	private String moveDefA1 = "";
	private int moveA1 = 0;
	private String moveDefA2 = "";
	private int moveA2 = 0;
	
//Move group B	
	private String moveDefB1 = "";
	private int moveB1 = 0;
	private String moveDefB2 = "";
	private int moveB2 = 0;
	
//Move group C	
	private String moveDefC1 = "";
	private int moveC1 = 0;
	private String moveDefC2 = "";
	private int moveC2 = 0;
	
//Move group D	
	private String moveDefD1 = "";
	private int moveD1 = 0;
	private String moveDefD2 = "";
	private int moveD2 = 0;
	
//Move group E	
	private String moveDefE1 = "";
	private int moveE1 = 0;
	private String moveDefE2 = "";
	private int moveE2 = 0;
	
	EnemyTemplate() {
	}
	
//Max health
	public double getMaxHealth() {
		return (maxHealth);
	}
	
//Health
	@Override
	public double getHealth() {
		return (health);
	}
	void setHealth(double newHealth) {
		health += newHealth;
	}
	
//Max energy
	@Override
	public int getMaxEnergy() {
		return (maxEnergy);
	}
//Energy
	@Override
	public int getEnergy() {
		return (energy);
	}
	void setEnergy(double newEnergy) {
		if (energy + newEnergy > maxEnergy) {
			energy = maxEnergy;
		}
		else {
			energy += newEnergy;
		}
	}
	
//Attack
	@Override
	public int getAttackStat() {
		return (attackStat);
	}
	void setAttackStat(double attackStatChange) {
		attackStat += attackStatChange;
	}
	
//Defense
	@Override
	public int getDefenseStat() {
		return (defenseStat);
	}
	void setDefenseStat(double defenseStatChange) {
		defenseStat += defenseStatChange;
	}
	
//Move group A
	@Override
	public String getMoveDefA1() {
		return moveDefA1;
	}
	public int getMoveA1() {
		return moveA1;
	}
	@Override
	public String getMoveDefA2() {
	return moveDefA2;
	}
	public int getMoveA2() {
		return moveA2;
	}
	
//Move group B
	@Override
	public String getMoveDefB1() {
		return moveDefB1;
	}
	public int getMoveB1() {
		return moveB1;
	}
	@Override
	public String getMoveDefB2() {
	return moveDefB2;
	}
	public int getMoveB2() {
		return moveB2;
	}
	
//Move group C
	@Override
	public String getMoveDefC1() {
		return moveDefC1;
	}
	public int getMoveC1() {
		return moveC1;
	}
	@Override
	public String getMoveDefC2() {
	return moveDefC2;
	}
	public int getMoveC2() {
		return moveC2;
	}
	
//Move group D
	@Override
	public String getMoveDefD1() {
		return moveDefD1;
	}
	public int getMoveD1() {
		return moveD1;
	}
	@Override
	public String getMoveDefD2() {
	return moveDefD2;
	}
	public int getMoveD2() {
		return moveD2;
	}
	
//Move group E
	@Override
	public String getMoveDefE1() {
		return moveDefE1;
	}
	public int getMoveE1() {
		return moveE1;
	}
	@Override
	public String getMoveDefE2() {
	return moveDefE2;
	}
	public int getMoveE2() {
		return moveE2;
	}
}