package component.player;

import enums.Team;

public class Mbappe  extends Forward {
	public Mbappe() {
		super(100,20,70); // not final
		super.setName("Mbappe");
		super.setTeam(Team.RealMadrid);
		super.setCoin(4);
	}
}
