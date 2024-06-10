package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds09 extends Card {

    public Diamonds09() {
        super();
        setAnimation(new Animation(getSprite(), 50, 51));
    }
}
