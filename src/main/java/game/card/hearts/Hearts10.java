package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts10 extends Card {

    public Hearts10() {
        super();
        setAnimation(new Animation(getSprite(), 23, 24));
    }
}
