package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades08 extends Card {

    public Spades08() {
        super();
        this.value = 8;
        setAnimation(new Animation(getSprite(), 7, 8));
    }
}
