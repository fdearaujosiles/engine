package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds04 extends Card {

    public Diamonds04() {
        super();
        setAnimation(new Animation(getSprite(), 45, 46));
    }
}
