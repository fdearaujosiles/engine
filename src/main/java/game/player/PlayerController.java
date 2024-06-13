package game.player;

import engine.controller.MouseInputListener;
import game.card.Card;

import java.awt.event.MouseEvent;

public class PlayerController extends MouseInputListener {

    private final PlayerHand hand;

    public PlayerController(Player player) {
        super(player);
        this.hand = player.getHand();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            handleLeftClick(e);
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            handleRightClick(e);
        }
    }

    private void handleLeftClick(MouseEvent e) {
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

    private void handleRightClick(MouseEvent e) {
        for (Card card : hand.getCards()) {
            if (isIn(e, card)) {
                resizeCard(card);
                break;
            }
        }
    }

    private void resizeCard(Card card) {
        card.setSize(-card.getWidth(), card.getHeight());
    }
}
