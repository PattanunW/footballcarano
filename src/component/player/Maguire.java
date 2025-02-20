package component.player;

import enums.Team;

public class Maguire extends Defender {
	public Maguire() {
		super(100,20,70); // not final
		super.setName("Maguire");
		super.setTeam(Team.ManUnited);
		super.setCoin(1);
	}
}
