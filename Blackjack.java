package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		
		//Initializing all variables
		
		boolean playerBust = false;
		boolean dealerBust = false;
		
		boolean playerDone = false;
		boolean player3Drawn = false;
		
		int playerCard1Value = 0;
		int playerCard2Value = 0;
		int playerCard3Value = 0;
		
		int dealerCard1Value = 0;
		int dealerCard2Value = 0;
		int dealerCard3Value = 0;
		
		Deck d = new Deck();		
		Person player = new Person();
		Person dealer = new Person();
		
		Scanner scan = new Scanner(System.in);
		
		//Dealing Cards to the player and house draws.
		
		for(int i = 0; i < 2; i++) {
			player.getHand().add(d.drawRandomCard());
			System.out.println(player.getHand().get(i).toString());
			dealer.getHand().add(d.drawRandomCard());
		}
		
		playerCard1Value = player.getHand().get(0).getRank();
		playerCard2Value = player.getHand().get(1).getRank();
		
		dealerCard1Value = dealer.getHand().get(0).getRank();
		dealerCard2Value = dealer.getHand().get(1).getRank();
		
		System.out.println();
		System.out.println("Is that 21?");
		
		//Setting Face Cards to the Value of Ten
		
		if(player.getHand().get(0).getRank() > 10) {
			playerCard1Value = 10;
		}else if(dealer.getHand().get(0).getRank() > 10) {
			dealerCard1Value = 10;
		}
		
		if(player.getHand().get(1).getRank() > 10) {
			playerCard2Value = 10;
		}else if(dealer.getHand().get(1).getRank() > 10) {
			dealerCard2Value = 10;
		}
		
		//Setting Ace values in relation to totals
		
		if(player.getHand().get(0).getRank() == 1 && playerCard2Value == 10) {
			playerCard1Value = 11;
		}else if(dealer.getHand().get(0).getRank() == 1 && dealerCard2Value == 10) {
			dealerCard1Value = 11;
		}
		
		if(player.getHand().get(1).getRank() == 1 && playerCard1Value == 10) {
			playerCard2Value = 11;
		}else if(dealer.getHand().get(1).getRank() == 1 && dealerCard1Value == 10) {
			dealerCard2Value = 11;
		}
		
		if(player.getHand().get(0).getRank() == 1 && playerCard2Value < 10) {
			playerCard2Value = 1;
		}else if(dealer.getHand().get(0).getRank() == 1 && dealerCard2Value < 10) {
			dealerCard2Value = 1;
		}
		
		if(player.getHand().get(1).getRank() == 1 && playerCard1Value < 10) {
			playerCard2Value = 1;
		}else if(dealer.getHand().get(1).getRank() == 1 && dealerCard1Value < 10) {
			dealerCard2Value = 1;
		}
		
		//Temporary Calculation of Values
		
		int playerTempValue = playerCard1Value + playerCard2Value;
		int dealerTempValue = dealerCard1Value + dealerCard2Value;
		
		//Implementation of the Hit function
		
		while(playerDone == false && player3Drawn == false) {
			if(playerBust == false) {
				System.out.print("Hit or Stay? (h / s): ");
				String choice = scan.nextLine();
				
				switch(choice) {
				case "h":
					player.getHand().add(d.drawRandomCard());
					player3Drawn = true;
					break;
				case "s":
					playerDone = true;
					break;
				}
			}
		}
		
		dealer.getHand().add(d.drawRandomCard());
		
		//Settling New Cards
		
		if(player3Drawn) {
			if(player.getHand().get(2) == null) {
				playerCard3Value = 0;
			}else {
				playerCard3Value = player.getHand().get(2).getRank();
			}
		}
		
		
		if(dealer.getHand().get(2) == null) {
			dealerCard3Value = 0;
		}else {
			dealerCard3Value = dealer.getHand().get(2).getRank();
		}
		
		//Calculating Third Card
		
		if(player3Drawn) {
			if(player.getHand().get(2).getRank() > 10) {
				playerCard3Value = 10;
		}
		
		}if(dealer.getHand().get(2).getRank() > 10) {
			dealerCard3Value = 10;
		}
		
		//Calculating Hands
		
		int playerTotalValue = playerTempValue + playerCard3Value;
		int dealerTotalValue = dealerTempValue + dealerCard3Value;
		
		//Who wins?
		
		if(playerTotalValue > dealerTotalValue && playerTotalValue <= 21) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("You Win!");
		}else if(playerTotalValue < dealerTotalValue && dealerTotalValue <= 21) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("You Lose!");
		}else if(playerTotalValue == dealerTotalValue) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("Split the Pot!");
		}else if(playerTotalValue > 21 && dealerTotalValue > 21) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("Pot Vanishes!");
		}else if(playerTotalValue > 21 && dealerTotalValue <= 21) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("You Lose!");
		}else if(playerTotalValue <= 21 && dealerTotalValue > 21) {
			System.out.println("Player Total: " + playerTotalValue);
			System.out.println("House: " + dealerTotalValue);
			System.out.println("You Win!");
		}
	}
}