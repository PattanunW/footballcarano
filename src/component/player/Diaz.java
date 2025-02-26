package component.player;

import enums.Team;

public class Diaz extends Forward {
	public Diaz() {
		super(100,20,70); // not final
		super.setName("Diaz");
		super.setTeam(Team.Liverpool);
		super.setCoin(2);
	}
}
