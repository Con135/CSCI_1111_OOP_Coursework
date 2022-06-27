
public class Bandit extends CharacterObject{
//The bandit doesn't use energy
	
//Main stats
	private double maxHealth = 100;
	private double health = 100;
	private int maxEnergy = 0;
	private int energy = 0;
	private int attackStat = 2;
	private int defenseStat = 0;

//Move group A
	private String moveDefA1 = "The bandit raises his blade and taunts you.";
	private int moveA1 = -(attackStat);
	private String moveDefA2 = "The bandit rushes forward and quickly slashes you!";
	private int moveA2 = 1;
	
//Move group B	
	private String moveDefB1 = "The bandit throws a knife at you!";
	private int moveB1 = 2;
	private String moveDefB2 = "The bandit swings his short sword at you!";
	private int moveB2 = 3;
	
//Move group C	
	private String moveDefC1 = "The bandit raises his small buckler in defense.";
	private int moveC1 = -(attackStat);
	private String moveDefC2 = "The bandit draws his crossbow and fires at you!";
	private int moveC2 = 5;
	
//Move group D	
	private String moveDefD1 = "The bandit throws a flurry of knives at you!";
	private int moveD1 = 6;
	private String moveDefD2 = "The bandit drinks a healing potion to restore his life.";
	private int moveD2 = -(attackStat);
	
//Move group E	
	private String moveDefE1 = "The bandit throws down a smoke bomb and disappears.";
	private int moveE1 = attackStat;
	private String moveDefE2 = "The bandit unleashes a torrent of rapid quick stabs at you!";
	private int moveE2 = 8;
	
	Bandit() {
	}
	
//Max health
	@Override
	public double getMaxHealth() {
		return maxHealth;
	}
//Health
	@Override
	public double getHealth() {
		return health;
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
		return attackStat;
	}
	void setAttack(double attackStatChange) {
		attackStat += attackStatChange;
	}
	
//Defense
	@Override
	public int getDefenseStat() {
		return defenseStat;
	}
	void setDefenseStat(double defenseStatChange) {
		defenseStat += defenseStatChange;
	}
	void resetDefenseStat() {
		defenseStat = 0;
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
		defenseStat += 10;
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
		health += 5;
		return moveD2;
	}	
	
//Move group E
	@Override
	public String getMoveDefE1() {
		defenseStat += 90;
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