package component.player;

import enums.Team;

public class VanDijk  extends Defender {
	public VanDijk() {
		super(100,20,70); // not final
		super.setName("Van Dijk");
		super.setTeam(Team.Liverpool);
		super.setCoin(5);
	}
}
