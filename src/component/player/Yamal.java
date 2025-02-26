package component.player;

import enums.Team;

public class Yamal extends Forward {
	public Yamal() {
		super(100,20,70); // not final
		super.setName("Yamal");
		super.setTeam(Team.Barcelona);
		super.setCoin(4);
	}
}
