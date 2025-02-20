package component.layout;

import java.util.ArrayList;

import component.player.BasePlayer;

public class Inventory {
	private ArrayList<BasePlayer>inventory;
	public Inventory() {
		inventory = new ArrayList<BasePlayer>();
	}
	public void add(Object player) {
		if(inventory.size()==6) {
			return;
		}
		inventory.add((BasePlayer) player);
	}
	public ArrayList<BasePlayer> getInventory() {
		return inventory;
	}
	public String toString() {
		String s="";
		for(BasePlayer b:inventory) {
			s += b.getName()+" ";
		}
		return s;
	}
	public void setInventory(ArrayList<BasePlayer> inventory) {
		this.inventory = inventory;
	}
}
