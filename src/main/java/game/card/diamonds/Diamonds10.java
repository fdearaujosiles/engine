package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds10 extends Card {

    public Diamonds10() {
        super();
        setAnimation(new Animation(getSprite(), 51, 52));
    }
}
