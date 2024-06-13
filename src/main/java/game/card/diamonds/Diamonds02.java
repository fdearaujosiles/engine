package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds02 extends Card {

    public Diamonds02() {
        super();
        this.value = 2;
        setAnimation(new Animation(getSprite(), 43, 44));
    }
}
