package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
		
	private ArrayList<Card> Deck = new ArrayList<Card>();
	private int counter;
	
	public Deck() {
		for(int i = 0; i < 53; i++) {
			Card c = new Card();
			Deck.add(c);
			counter++;
		}
	}

	public int getCounter() {
		return counter;
	}
	
	public Card drawRandomCard() {	
		Random rand = new Random();
		 int i = rand.nextInt(52);
		 
		Card f = Deck.get(i);
		return f;
		
	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}
}
