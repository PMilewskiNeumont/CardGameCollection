package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.Scanner;

public class GoFish {

	public static void main(String[] args) {
		
		//Initializing Variables
		
		Deck d = new Deck();		
		Person player = new Person();
		Person opponent = new Person();
		
		Scanner scan = new Scanner(System.in);
		
		//Creating Hands of Five
		
		for(int i = 0; i < 5; i++) {
			player.getHand().add(d.drawRandomCard());
			opponent.getHand().add(d.drawRandomCard());
		}
		
		//Checking Hands
		
		System.out.println(player.getHand());
		System.out.println(d.getDeck());
		
		//Calling for Matches
		
//		System.out.println("Input the Rank of the Card you want: ");
//		String call = scan.nextLine();
					
		}

}