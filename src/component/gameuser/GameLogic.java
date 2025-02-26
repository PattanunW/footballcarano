package component.gameuser;

import component.player.BasePlayer;
import component.player.Defender;
import component.player.Forward;
import component.player.Maguire; // example player, add others like Defenders, Midfielders, Forwards
import component.player.Midfielder;

import java.util.List;
import java.util.ArrayList;

public class GameLogic {
    private GameUser user;
    private GameUser bot;
    
    // Constructor to initialize the game state
    public GameLogic() {
        user = new GameUser();
        bot = new GameUser();
    }
    
    // Method to handle a new turn
    public void newTurn() {
        // Shop phase logic here
        // Example: Give user time to buy football players
        shopPhase();

        // Start battle phase
        battlePhase();
    }

    // Shop Phase: Let the user buy players
    private void shopPhase() {
        // Placeholder logic for purchasing players
        // Example: The user buys a player like Maguire
        BasePlayer playerToBuy = new Maguire(); // This can be based on user selection
        user.addPlayerToTeam(playerToBuy);
    }
    
    // Battle Phase: Simulate battle turn-by-turn
    private void battlePhase() {
        // Alternate turns between user and bot
        boolean battleOngoing = true;
        while (battleOngoing) {
            // User attacks first
            userAttack();
            if (checkVictory(user)) {
                System.out.println("User wins!");
                battleOngoing = false;
                break;
            }

            // Bot retaliates
            botAttack();
            if (checkVictory(bot)) {
                System.out.println("Bot wins!");
                battleOngoing = false;
                break;
            }
        }
    }

    // Handle User's attack
    private void userAttack() {
        for (BasePlayer userPlayer : user.getPlayers()) {
            if (userPlayer.getHealth() > 0) { // Ensure the player is still alive
                // Get a random opponent player
                BasePlayer opponentPlayer = getRandomOpponent();
                int damage = calculateDamage(userPlayer, opponentPlayer);
                opponentPlayer.takeDamage(damage); // Reduce opponent's health
                System.out.println(userPlayer.getClass().getSimpleName() + " attacks " + opponentPlayer.getClass().getSimpleName() + " for " + damage + " damage.");
            }
        }
    }

    // Handle Bot's attack
    private void botAttack() {
        for (BasePlayer botPlayer : bot.getPlayers()) {
            if (botPlayer.getHealth() > 0) { // Ensure the player is still alive
                // Get a random user player
                BasePlayer userPlayer = getRandomUser();
                int damage = calculateDamage(botPlayer, userPlayer);
                userPlayer.takeDamage(damage); // Reduce user player's health
                System.out.println(botPlayer.getClass().getSimpleName() + " attacks " + userPlayer.getClass().getSimpleName() + " for " + damage + " damage.");
            }
        }
    }

    // Calculate damage between two players based on attack/defense and type advantage
    private int calculateDamage(BasePlayer attacker, BasePlayer defender) {
        int damage = attacker.getAttack() - defender.getDefense();
        
        // Add type advantage modifiers
        if (attacker instanceof Defender && defender instanceof Forward) {
            damage *= 1.5; // Defender > Forward
        } else if (attacker instanceof Midfielder && defender instanceof Defender) {
            damage *= 1.5; // Midfielder > Defender
        } else if (attacker instanceof Forward && defender instanceof Midfielder) {
            damage *= 1.5; // Forward > Midfielder
        }

        return Math.max(damage, 0); // Prevent negative damage
    }

    // Check if a team is victorious (all opposing players are dead)
    private boolean checkVictory(GameUser team) {
        for (BasePlayer player : team.getPlayers()) {
            if (player.getHealth() > 0) {
                return false; // At least one player is still alive
            }
        }
        return true; // All players are dead, the team has won
    }

    // Helper method to get a random opponent player
    private BasePlayer getRandomOpponent() {
        List<BasePlayer> aliveOpponents = new ArrayList<>();
        for (BasePlayer player : bot.getPlayers()) {
            if (player.getHealth() > 0) {
                aliveOpponents.add(player);
            }
        }
        return aliveOpponents.get((int)(Math.random() * aliveOpponents.size()));
    }

    // Helper method to get a random user player
    private BasePlayer getRandomUser() {
        List<BasePlayer> aliveUserPlayers = new ArrayList<>();
        for (BasePlayer player : user.getPlayers()) {
            if (player.getHealth() > 0) {
                aliveUserPlayers.add(player);
            }
        }
        return aliveUserPlayers.get((int)(Math.random() * aliveUserPlayers.size()));
    }

    // Getters and Setters for user and bot
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
