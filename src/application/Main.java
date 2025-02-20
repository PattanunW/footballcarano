package application;

import component.player.BasePlayer;
import component.player.Maguire;

public class Main {
	public static void main(String[] args) {
		Maguire maguire = new Maguire();
		System.out.println(maguire.getHealth());
	}
}
