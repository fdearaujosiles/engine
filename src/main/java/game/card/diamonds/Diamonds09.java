package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds09 extends Card {

    public Diamonds09() {
        super();
        this.value = 9;
        setAnimation(new Animation(getSprite(), 50, 51));
    }
}
