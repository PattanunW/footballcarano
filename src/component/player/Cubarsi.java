package component.player;

import enums.Team;

public class Cubarsi extends Defender {
	public Cubarsi() {
		super(100,20,70); // not final
		super.setName("Cubarsi");
		super.setTeam(Team.Barcelona);
		super.setCoin(1);
	}
}
