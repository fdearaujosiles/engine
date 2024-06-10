package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds05 extends Card {

    public Diamonds05() {
        super();
        setAnimation(new Animation(getSprite(), 46, 47));
    }
}
