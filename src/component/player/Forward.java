package component.player;

import interfaces.CanAttack;

public class Forward extends BasePlayer implements CanAttack  {
	public Forward(int health,int attack,int defense) {
		super(health,attack,defense);
	}
	public void attack(BasePlayer b) {
		if(b instanceof Midfielder) {
			forwardSkill();
		}else if(b instanceof Forward) {
			
		}else if(b instanceof Defender) {
			
		}
	}
	public void forwardSkill() {
		// extra damage to midfielder
	}
}
