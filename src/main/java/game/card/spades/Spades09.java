package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades09 extends Card {

    public Spades09() {
        super();
        setAnimation(new Animation(getSprite(), 8, 9));
    }
}
