package component.gameuser;

import component.layout.Inventory;

public class GameUser {
	private int balance;
	private Inventory inventory;
	public GameUser() {
		this.balance=0;
		this.inventory=new Inventory();
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
	
}
