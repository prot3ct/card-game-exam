package org.elsys.cardgame.impl;

import org.elsys.cardgame.api.Game;
import org.elsys.cardgame.api.Operation;

public class DrawTopCard implements Operation {

	@Override
	public String getName() {
		return "drawTopCard";
	}

	@Override
	public void execute(Game game, String... params) {
		game.getDeck().drawTopCard();
	}
}
