package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades10 extends Card {

    public Spades10() {
        super();
        setAnimation(new Animation(getSprite(), 9, 10));
    }
}
