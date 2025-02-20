package component.player;

import enums.Team;

public class Maguire extends Defender {
	private Team team;
	private int coin;
	public Maguire() {
		super(100,20,70);
		team=Team.ManUnited;
		coin=1;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
}
