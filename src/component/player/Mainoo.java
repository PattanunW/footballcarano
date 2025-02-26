package component.player;

import enums.Team;

public class Mainoo extends Midfielder {

	public Mainoo() {
		super(100,20,70); // not final
		super.setName("Mainoo");
		super.setTeam(Team.ManUnited);
		super.setCoin(2);
	}
}
