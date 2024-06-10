package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades05 extends Card {

    public Spades05() {
        super();
        setAnimation(new Animation(getSprite(), 4, 5));
    }
}
