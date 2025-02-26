package component.player;

import enums.Team;

public class Raphinha extends Forward {
	public Raphinha() {
		super(100,20,70); // not final
		super.setName("Raphinha");
		super.setTeam(Team.Barcelona);
		super.setCoin(3);
	}

}
