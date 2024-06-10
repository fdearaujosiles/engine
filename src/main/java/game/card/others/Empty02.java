package game.card.others;

import game.card.Card;
import engine.sprite.Animation;

public class Empty02 extends Card {

    public Empty02() {
        super();
        setAnimation(new Animation(getSprite(), 0, 56));
    }
}
