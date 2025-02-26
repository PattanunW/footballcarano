package component.player;

import enums.Team;

public class DeLigt  extends Defender {
	public DeLigt() {
		super(100,20,70); // not final
		super.setName("De Ligt");
		super.setTeam(Team.ManUnited);
		super.setCoin(3);
	}
}
