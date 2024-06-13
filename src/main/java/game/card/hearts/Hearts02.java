package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts02 extends Card {

    public Hearts02() {
        super();
        this.value = 2;
        setAnimation(new Animation(getSprite(), 15, 16));
    }
}
