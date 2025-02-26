package component.player;

import enums.Team;

public class Pedri extends Midfielder {

	public Pedri() {
		super(100,20,70); // not final
		super.setName("Pedri");
		super.setTeam(Team.Barcelona);
		super.setCoin(3);
	}
}
