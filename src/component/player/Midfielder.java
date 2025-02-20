package component.player;

import interfaces.CanAttack;
import interfaces.CanDefend;

public class Midfielder extends BasePlayer implements CanDefend, CanAttack {
	public Midfielder(int health,int attack,int defense) {
		super(health,attack,defense);
	}
	public void defend(BasePlayer b) {
		
	}
	public void attack(BasePlayer b) {
		
	}
}
