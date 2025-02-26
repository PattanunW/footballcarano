package component.player;

import enums.Team;

public class Bellingham extends Midfielder{
	public Bellingham() {
		super(100,20,70); // not final
		super.setName("Bellingham");
		super.setTeam(Team.RealMadrid);
		super.setCoin(4);
	}
}
