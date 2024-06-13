package game.card;

import engine.sprite.Animation;
import engine.sprite.Sprite;
import game.utils.constants.Sprites;
import engine.game_object.GameObject;

public abstract class Card extends GameObject {

    public enum State {
        FACE_DOWN,
        FACE_UP,
        ON_DECK,
        ON_PILE
    }

    protected int value = 0;

    private State state = State.FACE_DOWN;
    private Animation cardBack;

    public void setState(State state) {
        this.state = state;
    }

    protected Card() {
        super();
        setSprite(Sprites.DEFAULT_CARD_DECK, 14, 4);
        setCardBack(new Animation(new Sprite(Sprites.DECKBACKS, 7, 4), 22, 23));
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
            case FACE_UP, ON_PILE -> super.getAnimation();
            case FACE_DOWN -> cardBack;
            case ON_DECK -> null;
        };
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
