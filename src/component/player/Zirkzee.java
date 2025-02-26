package component.player;

import enums.Team;

public class Zirkzee extends Forward {
	public Zirkzee() {
		super(100,20,70); // not final
		super.setName("Zirkzee");
		super.setTeam(Team.ManUnited);
		super.setCoin(1);
	}
}
