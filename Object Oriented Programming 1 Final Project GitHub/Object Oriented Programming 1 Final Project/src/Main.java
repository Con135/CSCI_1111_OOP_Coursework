import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean enemyStage1 = true;
		boolean enemyStage2 = true;
		boolean enemyStage3 = true;
		boolean enemyStage4 = true;
		boolean enemyStage5 = true;
		
		String[] abilityList = new String[4];
		abilityList[0] = "Healing Flash";
		abilityList[1] = "Defensive Shield";
		abilityList[2] = "Magic Blast";
		abilityList[3] = "Magic Storm";
		
		int[] abilityCostList = new int[4];
		abilityCostList[0] = 2;
		abilityCostList[1] = 3;
		abilityCostList[2] = 5;
		abilityCostList[3] = 10;
		
		System.out.println("What is the hero's name?");
		String playerName = input.next();
		Player player1 = new Player();
		Bandit enemy1 = new Bandit();
		/*
		System.out.println("Player Stats: " +
				   "\nHealth: " + player1.getHealth() +
				   "\nAttack: " + player1.getAttackStat() +						
				   "\nDefense: " + player1.getDefenseStat() +
				   "\nSpeed: " + player1.getSpeedStat());
		*/
		
		

		/*
		System.out.println("Bandit Stats: " +
						   "\nHealth: " + enemy1.getHealth() +
						   "\nAttack: " + enemy1.getAttackStat() +						
						   "\nDefense: " + enemy1.getDefenseStat() +
						   "\nSpeed: " + enemy1.getSpeedStat());
		*/
		
//Battle start and turn order
		System.out.println("Battle starts.");
		while (enemy1.getHealth() > 0 && player1.getHealth() > 0) {
				playerTurn(player1, enemy1, playerName, abilityList, abilityCostList);
				enemyTurn(player1, enemy1, playerName, enemyStage1, enemyStage2, enemyStage3, enemyStage4, enemyStage5);
				player1.resetDefenseStat();
				player1.setEnergy(2);
		}
//Battle results	
		if (enemy1.getHealth() <= 0 && player1.getHealth() > 0) {
			System.out.println("You win!");
		}
		else if (player1.getHealth() <= 0 && enemy1.getHealth() > 0) {
			System.out.println("You lost.");
		}
		else {
			System.out.println("Draw.");
		}
	}
			
//Player's turn	
	public static void playerTurn(Player player1, Bandit enemy1, String playerName, String[] abilityList, int[] abilityCostList) {
		int row;
		int playerChoice;
		boolean playerValidChoice;
		int abilityChoice;
		boolean abilityValidChoice;
			do {
				Scanner input = new Scanner(System.in);
				playerValidChoice = true;
				System.out.println(playerName + "'s turn: " + "\nHealth: " + player1.getHealth() + "\nEnergy: " + player1.getEnergy() + "\n1-Attack(5 damage)" + "\n2-Defend(3 defense)" + "\n3-Use ability");
		
				try {
					playerChoice = input.nextInt();
				
					if (playerChoice == 1) {
						System.out.println(playerName + " attacks!");
						enemy1.setHealth(-5 + player1.getAttackStat());
						if (player1.getAttackStat() + 5 > enemy1.getDefenseStat()) {
							player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA1())));
						}
					}
					else if (playerChoice == 2) {
						System.out.println(playerName + " defends themselves!");
						player1.setDefenseStat(3);
					}
//Player's spells
					else if (playerChoice == 3) {
						do {
							abilityValidChoice = true;
							System.out.print(playerName + "'s Abilities:\n");
							for (row = 0; row < abilityList.length; row++) {
									System.out.print(abilityList[row] + ": " + abilityCostList[row] + " Energy");
									System.out.println();
							}
							System.out.println("Enter \"1-4\" to use a spell or \"5\" to exit your ability list.\n");
							abilityChoice = input.nextInt();
			
							if (abilityChoice == 1) {
								if (abilityCostList[0] >= player1.getEnergy()) {
									System.out.println(playerName + " uses Healing Flash to heal 5 life!");
									player1.setHealth(5);
									player1.setEnergy(-2);
								}
								else {
									System.out.println(playerName + " doesn't have enough energy.");
									abilityValidChoice = false;
								}
							}
							else if (abilityChoice == 2) {
								if (abilityCostList[1] >= player1.getEnergy()) {
									System.out.println(playerName + " uses Defensive Shield!");
									player1.setDefenseStat(5);
									player1.setEnergy(-3);
								}
								else {
									System.out.println(playerName + " doesn't have enough energy.");
									abilityValidChoice = false;
								}
							}
							else if (abilityChoice == 3) {
								if (abilityCostList[2] >= player1.getEnergy()) {
									System.out.println(playerName + " uses Magic Blast to attack!");
									if (player1.getAttackStat() + 10 > enemy1.getDefenseStat()) {
										player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA1())));
									}
									player1.setEnergy(-5);
								}
								else {
									System.out.println(playerName + " doesn't have enough energy.");
									abilityValidChoice = false;
								}
							}
							else if (abilityChoice == 4) {
								if (abilityCostList[3] >= player1.getEnergy()) {
									System.out.println(playerName + " uses Magic Storm to attack!");
									if (player1.getAttackStat() + 20 > enemy1.getDefenseStat()) {
										player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA1())));
									}
									player1.setEnergy(-10);
								}
								else {
									System.out.println(playerName + " doesn't have enough energy.");
									abilityValidChoice = false;
								}
							}
							else if (abilityChoice == 5) {
								playerValidChoice = false;
							}
							else {
								System.out.println("Please enter only 1-5.");
								abilityValidChoice = false;
							}

						} while (abilityValidChoice == false);
					}	
//Checking player's choice
					else {
						System.out.println("Please enter only 1-3.");
						playerValidChoice = false;
					}
				}
				catch (InputMismatchException ex) {
					System.out.println("Please enter only the requested numbers.");
					playerValidChoice = false;
				}
			} while (playerValidChoice == false);
	}
//Enemy's turn
	public static void enemyTurn(Player player1, Bandit enemy1, String playerName, boolean enemyStage1, boolean enemyStage2, boolean enemyStage3, boolean enemyStage4, boolean enemyStage5) {
			System.out.println("Bandit's health : " + enemy1.getHealth());
			int enemyChoice;
//80% health phase		
			if (enemy1.getHealth() / enemy1.getMaxHealth() >= .80 && enemyStage1 == true) {
				enemyChoice = (int)(Math.random() * 20);
				if (enemyChoice <= 9) {
					System.out.println(enemy1.getMoveDefA1());
					if (enemy1.getAttackStat() + enemy1.getMoveA1() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA1())));
					}
				}
				else {
					System.out.println(enemy1.getMoveDefA2());
					if (enemy1.getAttackStat() + enemy1.getMoveA2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA2())));
					}
				}
			}
//60% health phase	
			else if (enemy1.getHealth() / enemy1.getMaxHealth() >= .60 && enemyStage2 == true) {
				enemyStage1 = false;
				enemyChoice = (int)(Math.random() * 30);
				if (enemyChoice <= 9) {
					System.out.println(enemy1.getMoveDefA2());
					if (enemy1.getAttackStat() + enemy1.getMoveA2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA2())));
					}
				}
				else if (enemyChoice >= 10 && enemyChoice <= 19) {
					System.out.println(enemy1.getMoveDefB1());
					if (enemy1.getAttackStat() + enemy1.getMoveB1() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveB1())));
					}
				}
				else {
					System.out.println(enemy1.getMoveDefB2());
					if (enemy1.getAttackStat() + enemy1.getMoveB2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveB2())));
					}
				}
			}
//40% health phase	
			else if (enemy1.getHealth() / enemy1.getMaxHealth() >= .40 && enemyStage3 == true) {
				enemyStage2 = false;
				enemyChoice = (int)(Math.random() * 40);
				if (enemyChoice <= 9) {
					System.out.println(enemy1.getMoveDefA2());
					if (enemy1.getAttackStat() + enemy1.getMoveA2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA2())));
					}
				}
				else if (enemyChoice >= 10 && enemyChoice <= 19) {
					System.out.println(enemy1.getMoveDefB2());
					if (enemy1.getAttackStat() + enemy1.getMoveB2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveB2())));
					}
				}
				else if (enemyChoice >= 20 && enemyChoice <= 29) {
					System.out.println(enemy1.getMoveDefC1());
					if (enemy1.getAttackStat() + enemy1.getMoveC1() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveC1())));
					}
				}
				else {
					System.out.println(enemy1.getMoveDefC2());
					if (enemy1.getAttackStat() + enemy1.getMoveC2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveC2())));
					}
				}
			}
//20% health phase	
			else if (enemy1.getHealth() / enemy1.getMaxHealth() >= .20 && enemyStage4 == true) {
				enemyStage3 = false;
				enemyChoice = (int)(Math.random() * 50);
				if (enemyChoice <= 9) {
					System.out.println(enemy1.getMoveDefA2());
					if (enemy1.getAttackStat() + enemy1.getMoveA2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA2())));
					}
				}
				else if (enemyChoice >= 10 && enemyChoice <= 19) {
					System.out.println(enemy1.getMoveDefB2());
					if (enemy1.getAttackStat() + enemy1.getMoveB2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveB2())));
					}
				}
				else if (enemyChoice >= 20 && enemyChoice <= 29) {
					System.out.println(enemy1.getMoveDefC2());
					if (enemy1.getAttackStat() + enemy1.getMoveC2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveC2())));
					}
				}
				else if (enemyChoice >= 30 && enemyChoice <= 39) {
					System.out.println(enemy1.getMoveDefD1());
					if (enemy1.getAttackStat() + enemy1.getMoveD1() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveD1())));
					}
				}
				else {
					System.out.println(enemy1.getMoveDefD2());
					if (enemy1.getAttackStat() + enemy1.getMoveD2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveD2())));
					}
				}
			}
//01% health phase	
			else if (enemy1.getHealth() / enemy1.getMaxHealth() >= .01 && enemyStage5 == true) {
				enemyStage4 = false;
				enemyChoice = (int)(Math.random() * 60);
				if (enemyChoice <= 9) {
					System.out.println(enemy1.getMoveDefA2());
					if (enemy1.getAttackStat() + enemy1.getMoveA2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveA2())));
					}
				}
				else if (enemyChoice >= 10 && enemyChoice <= 19) {
					System.out.println(enemy1.getMoveDefB2());
					if (enemy1.getAttackStat() + enemy1.getMoveB2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveB2())));
					}
				}
				else if (enemyChoice >= 20 && enemyChoice <= 29) {
					System.out.println(enemy1.getMoveDefC2());
					if (enemy1.getAttackStat() + enemy1.getMoveC2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveC2())));
					}
				}
				else if (enemyChoice >= 30 && enemyChoice <= 39) {
					System.out.println(enemy1.getMoveDefD2());
					if (enemy1.getAttackStat() + enemy1.getMoveD2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveD2())));
					}
				}
				else if (enemyChoice >= 40 && enemyChoice <= 49) {
					System.out.println(enemy1.getMoveDefE1());
					if (enemy1.getAttackStat() + enemy1.getMoveE1() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveE1())));
					}
				}
				else {
					System.out.println(enemy1.getMoveDefE2());
					if (enemy1.getAttackStat() + enemy1.getMoveE2() > player1.getDefenseStat()) {
						player1.setHealth(-1 * (player1.getDefenseStat() - (enemy1.getAttackStat() + enemy1.getMoveE2())));
					}
				}
			}
//Enemy phase wrap up
			else {
				enemyStage5 = false;
			}
		}
}	