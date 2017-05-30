package org.elsys.cardgame.impl;

import org.elsys.cardgame.api.CardException;
import org.elsys.cardgame.api.Game;
import org.elsys.cardgame.api.Operation;

public class Highest implements Operation {

	@Override
	public String getName() {
		return "highest";
	}

	@Override
	public void execute(Game game, String... params) {
		if (game.getDealtHand() == null) {
			throw new CardException("There isn't dealt hand.");
		}
		if (game.getDealtHand().getCards().size() == 0) {
			throw new CardException("There aren't cards in the hand");
		}
		
		game.getDealtHand().highest();
	}

}
