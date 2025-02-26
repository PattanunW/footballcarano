package component.player;

import enums.Team;

public class Rudiger extends Defender{
	public Rudiger() {
		super(100,20,70); // not final
		super.setName("Rudiger");
		super.setTeam(Team.RealMadrid);
		super.setCoin(5);
	}
}
