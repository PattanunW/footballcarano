package component.player;

import enums.Team;

public class Ronaldo extends Forward {
	public Ronaldo() {
		super(100,20,70); // not final
		super.setName("Ronaldo");
		super.setTeam(Team.ManUnited);
		super.setCoin(5);
	}
}
