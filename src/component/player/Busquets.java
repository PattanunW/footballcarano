package component.player;

import enums.Team;

public class Busquets extends Midfielder{
	public Busquets() {
		super(100,20,70); // not final
		super.setName("Busquets");
		super.setTeam(Team.Barcelona);
		super.setCoin(5);
	}
}
