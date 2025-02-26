package component.player;

import enums.Team;

public class Max extends Forward {
	public Max() {
		super(100,20,70); // not final
		super.setName("Max");
		super.setTeam(Team.Barcelona);
		super.setCoin(1);
	}
}
