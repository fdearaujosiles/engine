package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds07 extends Card {

    public Diamonds07() {
        super();
        this.value = 7;
        setAnimation(new Animation(getSprite(), 48, 49));
    }
}
