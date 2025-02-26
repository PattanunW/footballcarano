package component.player;

import enums.Team;

public class Kounde extends Defender {
	public Kounde() {
		super(100,20,70); // not final
		super.setName("Kounde");
		super.setTeam(Team.Barcelona);
		super.setCoin(2);
	}
}
