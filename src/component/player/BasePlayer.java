package component.player;

import enums.Team;

public class BasePlayer {
	private int health;
	private int attack;
	private int defense;
	private String name;
	private Team team;
	private int coin;
	public BasePlayer(int health,int attack,int defense) {
		this.health=health;
		this.attack=attack;
		this.defense=defense;
		this.name=null;
		this.team=null;
		this.coin=0;
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
}
