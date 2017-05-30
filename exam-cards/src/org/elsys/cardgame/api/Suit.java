package org.elsys.cardgame.api;

public enum Suit {

	CLUBS("C", 1),
	DIAMONDS("D", 2),
	HEARTS("H" , 3),
	SPADES("S" , 4);

	private String symbol;
	private int strength;

	Suit(String symbol, int strength) {
		this.symbol = symbol;
		this.setStrength(strength);
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
}
