package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.Random;

public class Deck {
		
	private Card deck[] = new Card[52];
	private int counter;
	
	public Deck() {
		for(int i = 0; i < deck.length; i++) {
			Card c = new Card();
			deck[i] = c;
			counter++;
		}
	}

	public int getCounter() {
		return counter;
	}
	
	public Card drawRandomCard() {	
		Random rand = new Random();
		 int i = rand.nextInt(52);
		 
		Card f = deck[i];
		return f;
		
	}
}
