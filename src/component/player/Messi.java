package component.player;

import enums.Team;

public class Messi extends Forward {
	public Messi() {
		super(100,20,70); // not final
		super.setName("Messi");
		super.setTeam(Team.Barcelona);
		super.setCoin(5);
	}

}
