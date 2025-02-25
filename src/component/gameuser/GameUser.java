package component.gameuser;

import component.layout.Inventory;
import component.player.BasePlayer;
import java.util.ArrayList;
import java.util.List;

public class GameUser {
	private int balance;
	private Inventory inventory;
    private List<BasePlayer> players; // List of players in the user's team
	public GameUser() {
		this.balance=0;
		this.inventory=new Inventory();
        players = new ArrayList<>();
	}
	public void addBalance(int coin) {
		setBalance(getBalance()+coin);
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

    // Add a player to the team
    public void addPlayerToTeam(BasePlayer player) {
        players.add(player);
    }

    // Get the list of players in the user's team
    public List<BasePlayer> getPlayers() {
        return players;
    }

    // Set the list of players in the user's team
    public void setPlayers(List<BasePlayer> players) {
        this.players = players;
    }

    // Remove a player from the user's team
    public void removePlayer(BasePlayer player) {
        players.remove(player);
    }

    // Check if there are any players left in the team
    public boolean hasAlivePlayers() {
        for (BasePlayer player : players) {
            if (player.getHealth() > 0) {
                return true;
            }
        }
        return false;
    }

    // Helper method to get a specific player from the team
    public BasePlayer getPlayerByIndex(int index) {
        if (index >= 0 && index < players.size()) {
            return players.get(index);
        }
        return null; // Return null if index is out of bounds
    }

    // Method to print the team status (for debugging or UI)
    public void printTeamStatus() {
        for (BasePlayer player : players) {
            System.out.println(player.getClass().getSimpleName() + " - Health: " + player.getHealth());
        }
    }
}