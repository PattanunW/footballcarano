package component.gameuser;

public class GameLogic {
	private GameUser user;
	private GameUser bot;
	public GameLogic() {
		user=new GameUser();
		bot=new GameUser();
	}
	public void newTurn() {
		// user have time to buy football player from shop for ... seconds
		
		// battle phase
	}
	public GameUser getUser() {
		return user;
	}
	public void setUser(GameUser user) {
		this.user = user;
	}
	public GameUser getBot() {
		return bot;
	}
	public void setBot(GameUser bot) {
		this.bot = bot;
	}
	
}
