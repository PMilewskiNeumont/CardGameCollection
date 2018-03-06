package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.Random;

public class Card {
	
	private int suit;
	private int rank;
	private String suits = "";
	private String ranks = "";
	
	public Card() {
		
		Random rand = new Random();
		
		this.suit = rand.nextInt(4) + 1;
		this.rank = rand.nextInt(13) + 1;
	
	switch (suit) {
		case 1:
			this.suits = "Clubs";
			break;
		case 2:
			this.suits = "Spades";
			break;
		case 3:
			this.suits = "Diamonds";
			break;
		case 4:
			this.suits = "Hearts";
			break;
		default:
			this.suits = "Joker";
			break;
	}
	
	switch (rank) {
	case 1:
		this.ranks = "Ace";
		break;
	case 2:
		this.ranks = "Two";
		break;
	case 3:
		this.ranks = "Three";
		break;
	case 4:
		this.ranks = "Four";
		break;
	case 5:
		this.ranks = "Five";
		break;
	case 6:
		this.ranks = "Six";
		break;
	case 7:
		this.ranks = "Seven";
		break;
	case 8:
		this.ranks = "Eight";
		break;
	case 9:
		this.ranks = "Nine";
		break;
	case 10:
		this.ranks = "Ten";
		break;
	case 11:
		this.ranks = "Jack";
		break;
	case 12:
		this.ranks = "Queen";
		break;
	case 13:
		this.ranks = "King";
	}
}

	public int getRank() {
		return rank;
	}
	
	public String toString() {
		return "Card Drawn: " + this.ranks + " of " + this.suits;
	}
}