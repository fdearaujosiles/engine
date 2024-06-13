package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds03 extends Card {

    public Diamonds03() {
        super();
        this.value = 3;
        setAnimation(new Animation(getSprite(), 44, 45));
    }
}
