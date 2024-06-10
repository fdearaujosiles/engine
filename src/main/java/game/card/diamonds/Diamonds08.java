package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds08 extends Card {

    public Diamonds08() {
        super();
        setAnimation(new Animation(getSprite(), 49, 50));
    }
}
