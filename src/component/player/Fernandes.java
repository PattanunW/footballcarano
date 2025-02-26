package component.player;

import enums.Team;

public class Fernandes extends Midfielder {
	public Fernandes() {
		super(100,20,70); // not final
		super.setName("Fernandes");
		super.setTeam(Team.ManUnited);
		super.setCoin(4);
	}

}
