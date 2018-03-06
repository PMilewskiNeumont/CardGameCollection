package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.Scanner;

public class War {

	public static void main(String[] args) {
		
		//Initializing of Variables
		
		Deck d = new Deck();		
		Person player = new Person();
		Person dealer = new Person();
		
		Scanner scan = new Scanner(System.in);
		
		//Splitting the Deck
		
		for(int i = 0; i < 26; i++) {
			player.getHand().add(d.drawRandomCard());
			System.out.println(player.getHand().get(i).toString());
			dealer.getHand().add(d.drawRandomCard());
		}
		
		

	}

}
