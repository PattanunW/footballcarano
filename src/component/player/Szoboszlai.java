package component.player;

import enums.Team;

public class Szoboszlai extends Midfielder {

	public Szoboszlai() {
		super(100,20,70); // not final
		super.setName("Szoboszlai");
		super.setTeam(Team.Liverpool);
		super.setCoin(2);
	}
}
