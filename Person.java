package edu.neumont.csc150.FinalProject.MilewskiP;

import java.util.ArrayList;

public class Person {

	private ArrayList<Card> hand = new ArrayList<Card>();

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}
