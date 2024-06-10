package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds07 extends Card {

    public Diamonds07() {
        super();
        setAnimation(new Animation(getSprite(), 48, 49));
    }
}
