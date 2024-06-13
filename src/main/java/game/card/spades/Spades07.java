package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades07 extends Card {

    public Spades07() {
        super();
        this.value = 7;
        setAnimation(new Animation(getSprite(), 6, 7));
    }
}
