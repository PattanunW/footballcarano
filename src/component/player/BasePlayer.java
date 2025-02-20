package component.player;

public class BasePlayer {
	private int health;
	private int attack;
	private int defense;
	public BasePlayer(int health,int attack,int defense) {
		this.health=health;
		this.attack=attack;
		this.defense=defense;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
