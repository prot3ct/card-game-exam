package org.elsys.cardgame.api;

public enum Rank {

	TWO("2" , 1),
	THREE("3", 2),
	FOUR("4", 3),
	FIVE("5", 4),
	SIX("6", 5),
	SEVEN("7", 6),
	EIGHT("8", 7),
	NINE("9", 8),
	TEN("10", 9),
	JACK("J", 10),
	QUEEN("Q", 11),
	KING("K", 12),
	ACE("A", 13);

	private String symbol;
	private int strength;
	
	Rank(String symbol, int strength) {
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
