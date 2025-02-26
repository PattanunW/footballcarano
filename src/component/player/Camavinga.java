package component.player;

import enums.Team;

public class Camavinga extends Midfielder {
	public Camavinga() {
		super(100,20,70); // not final
		super.setName("Camavinga");
		super.setTeam(Team.RealMadrid);
		super.setCoin(3);
	}
}
