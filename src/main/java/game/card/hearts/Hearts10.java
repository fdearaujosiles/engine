package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts10 extends Card {

    public Hearts10() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 23, 24));
    }
}
