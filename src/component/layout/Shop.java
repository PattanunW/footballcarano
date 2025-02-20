package component.layout;

import java.util.ArrayList;
import java.util.Random;

import component.player.BasePlayer;
import component.player.Maguire;
import component.player.Mendy;

public class Shop {
	private ArrayList<BasePlayer>shop;
	public Shop() {
		shop = new ArrayList<BasePlayer>();
	}
	public void generateShop() {
		Random random = new Random();
		for(int i=0;i<5;i++) {
			int randomNumber = random.nextInt(100)+1;
			if(randomNumber>=1 && randomNumber<=50) {
				Maguire maguire = new Maguire();
				shop.add(maguire);
			}else {
				Mendy mendy = new Mendy();
				shop.add(mendy);
			}
		}
	}
	public String toString() {
		String s="";
		for(BasePlayer b:shop) {
			s += b.getName()+" ";
		}
		return s;
	}
	public ArrayList<BasePlayer> getShop() {
		return shop;
	}
	public void setShop(ArrayList<BasePlayer> shop) {
		this.shop = shop;
	}
}
