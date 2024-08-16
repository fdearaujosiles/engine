package game.opponent;

import engine.input.MouseInputListener;
import game.card.Card;

import java.awt.event.MouseEvent;

public class OpponentController extends MouseInputListener {

    private final OpponentHand hand;

    public OpponentController(Opponent opponent) {
        super(opponent);
        this.hand = opponent.getHand();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            if (isIn(e, hand.getDeck())) {
                hand.drawCard();
                return;
            }
            if (isIn(e, hand.getPile())) {
                hand.drawFromPile();
                return;
            }
            for (Card card : hand.getCards()) {
                if (isIn(e, card)) {
                    hand.discardCard(card);
                    break;
                }
            }
        }
    }
}
