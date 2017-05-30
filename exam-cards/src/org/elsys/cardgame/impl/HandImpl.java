package org.elsys.cardgame.impl;

import java.util.List;

import org.elsys.cardgame.api.Card;
import org.elsys.cardgame.api.Hand;

public class HandImpl implements Hand {

	private List<Card> cards;
	
	public HandImpl(List<Card> handCards) {
		this.cards = handCards;
	}

	@Override
	public List<Card> getCards() {
		return cards;
	}

	public Card highest() {
		Card strongestCard = cards.get(0);
		
		for (int i = 1; i < cards.size(); i++) {
			Card comparingCard = cards.get(i);
			if (strongestCard.getSuit().getStrength() 
			  * strongestCard.getRank().getStrength()
			  < comparingCard.getSuit().getStrength() 
			  * comparingCard.getRank().getStrength()) {
				strongestCard = comparingCard;
			}
		}
		return strongestCard;
	}
}
