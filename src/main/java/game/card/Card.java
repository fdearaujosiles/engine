package game.card;

import engine.sprite.Animation;
import engine.sprite.Sprite;
import engine.utils.constants.Sprites;
import engine.gameObject.GameObject;

public abstract class Card extends GameObject {

    public static enum State {
        FaceDown,
        FaceUp,
        OnDeck,
        OnPile
    }

    public int value;
    private State state = State.OnDeck;
    private Animation cardBack;

    public void setState(State state) {
        this.state = state;
    }

    public Card() {
        super();
        setSprite(Sprites.DEFAULT_CARD_DECK, 14, 4);
        setCardBack(new Animation(new Sprite(Sprites.DECKBACKS, 7, 4), 23, 24));
        setMouseInputs(new CardController(this));
    }

    public Animation getCardBack() {
        return cardBack;
    }

    public void setCardBack(Animation cardBack) {
        this.cardBack = cardBack;
    }

    @Override
    public Animation getAnimation() {
        return switch (state) {
            case FaceUp -> super.getAnimation();
            case FaceDown -> cardBack;
            case OnDeck -> null;
            case OnPile -> null;
        };
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
