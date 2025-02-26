package component.player;

import enums.Team;

public class Gravenberch extends Midfielder {
	public Gravenberch() {
		super(100,20,70); // not final
		super.setName("Gravenberch");
		super.setTeam(Team.Liverpool);
		super.setCoin(4);
	}
}
