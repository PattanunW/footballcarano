package component.player;

import enums.Team;

public class Zidane extends Midfielder{
	public Zidane() {
		super(100,20,70); // not final
		super.setName("Zidane");
		super.setTeam(Team.RealMadrid);
		super.setCoin(5);
	}
}
