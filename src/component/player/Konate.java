package component.player;

import enums.Team;

public class Konate extends Defender{
	public Konate() {
		super(100,20,70); // not final
		super.setName("Konate");
		super.setTeam(Team.Liverpool);
		super.setCoin(3);
	}
}
