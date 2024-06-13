package game.player;

import game.card.Card;
import game.card.Deck;
import game.card.Hand;
import game.card.Pile;

public class PlayerHand extends Hand {

    public PlayerHand(Deck deck, Pile pile) {
        super(deck, pile);
    }

    @Override
    public void addCard(Card card) {
        super.addCard(card);
        card.setState(Card.State.FACE_UP);
    }
}
