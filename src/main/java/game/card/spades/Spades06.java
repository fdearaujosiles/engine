package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades06 extends Card {

    public Spades06() {
        super();
        setAnimation(new Animation(getSprite(), 5, 6));
    }
}
