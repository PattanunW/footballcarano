package component.player;

import enums.Team;

public class Mendy extends Defender {
	public Mendy() {
		super(100,20,70); // not final
		super.setName("Mendy");
		super.setTeam(Team.RealMadrid);
		super.setCoin(1);
	}
}
