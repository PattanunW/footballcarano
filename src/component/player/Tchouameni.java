package component.player;

import enums.Team;

public class Tchouameni extends Midfielder {
	public Tchouameni() {
		super(100,20,70); // not final
		super.setName("Tchouameni");
		super.setTeam(Team.RealMadrid);
		super.setCoin(1);
	}
}
