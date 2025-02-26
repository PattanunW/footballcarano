package component.player;

import enums.Team;

public class Araujo extends Defender {
	public Araujo() {
		super(100,20,70); // not final
		super.setName("Araujo");
		super.setTeam(Team.Barcelona);
		super.setCoin(4);
	}
}
