package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class Diamonds06 extends Card {

    public Diamonds06() {
        super();
        this.value = 6;
        setAnimation(new Animation(getSprite(), 47, 48));
    }
}
