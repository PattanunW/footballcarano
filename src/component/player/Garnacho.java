package component.player;

import enums.Team;

public class Garnacho extends Forward{
	public Garnacho() {
		super(100,20,70); // not final
		super.setName("Garnacho");
		super.setTeam(Team.ManUnited);
		super.setCoin(2);
	}

}
