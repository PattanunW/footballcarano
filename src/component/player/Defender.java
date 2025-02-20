package component.player;

import interfaces.CanDefend;

public class Defender extends BasePlayer implements CanDefend {
	public Defender(int health,int attack,int defense) {
		super(health,attack,defense);
	}
	public void defend(BasePlayer b) {
		
	}
}
