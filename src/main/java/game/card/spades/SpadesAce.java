package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class SpadesAce extends Card {

    public SpadesAce() {
        super();
        setAnimation(new Animation(getSprite(), 0, 1));
    }
}
