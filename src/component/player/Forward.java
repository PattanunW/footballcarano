package component.player;

import interfaces.CanAttack;

public class Forward extends BasePlayer implements CanAttack  {
	public Forward(int health,int attack,int defense) {
		super(health,attack,defense);
	}
	public void attack(BasePlayer b) {
		
	}
}
