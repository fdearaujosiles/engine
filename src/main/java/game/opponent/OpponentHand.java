package game.opponent;

import game.card.Card;
import game.card.Deck;
import game.card.Hand;
import game.card.Pile;

public class OpponentHand extends Hand {

    public OpponentHand(Deck deck, Pile pile) {
        super(deck, pile);
    }

    @Override
    public void addCard(Card card) {
        super.addCard(card);
        card.setState(Card.State.FACE_DOWN);
    }
}
