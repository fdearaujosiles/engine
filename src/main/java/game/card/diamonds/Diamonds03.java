package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds03 extends Card {

    public Diamonds03() {
        super();
        setAnimation(new Animation(getSprite(), 44, 45));
    }
}
