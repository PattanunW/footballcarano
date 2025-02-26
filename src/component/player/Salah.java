package component.player;

import enums.Team;

public class Salah extends Forward {
	public Salah() {
		super(100,20,70); // not final
		super.setName("Salah");
		super.setTeam(Team.Liverpool);
		super.setCoin(5);
	}
}
