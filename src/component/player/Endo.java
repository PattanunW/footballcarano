package component.player;

import enums.Team;

public class Endo extends Midfielder {
	public Endo() {
		super(100,20,70); // not final
		super.setName("Endo");
		super.setTeam(Team.Liverpool);
		super.setCoin(1);
	}
}
