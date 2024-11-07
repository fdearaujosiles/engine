package game.card;

import engine.sprite.Animation;
import engine.sprite.Sprite;
import game.utils.constants.Sprites;
import engine.game_object.GameObject;

public class Card extends GameObject {

    public enum State {
        FACE_DOWN,
        FACE_UP,
        ON_DECK,
        ON_PILE
    }

    private CardValue cardValue;
    private CardEffect effect;

    private State state = State.FACE_DOWN;
    private Animation cardBack;

    public void setState(State state) {
        this.state = state;
    }

    protected Card(CardValue cardValue) {
        super();
        setSprite(Sprites.DEFAULT_CARD_DECK, 14, 4);
        setCardValue(cardValue);
        setCardBack(new Animation(new Sprite(Sprites.DECKBACKS, 7, 4), 22, 23));
        setMouseInputs(new CardController(this));
    }

    private void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
        this.effect = new CardEffect(cardValue);
        setAnimation(cardValue.ordinal(), cardValue.ordinal() + 1);
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

    public CardValue getCardValue() {
        return cardValue;
    }

    public CardEffect getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
