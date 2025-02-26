package component.player;

import enums.Team;

public class Martinez extends Defender {
	public Martinez() {
		super(100,20,70); // not final
		super.setName("Martinez");
		super.setTeam(Team.ManUnited);
		super.setCoin(4);
	}

}
