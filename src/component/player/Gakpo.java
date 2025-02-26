package component.player;

import enums.Team;

public class Gakpo extends Forward {
	public Gakpo() {
		super(100,20,70); // not final
		super.setName("Gakpo");
		super.setTeam(Team.Liverpool);
		super.setCoin(3);
	}
}
