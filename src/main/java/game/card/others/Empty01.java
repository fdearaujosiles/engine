package game.card.others;

import game.card.Card;
import engine.sprite.Animation;

public class Empty01 extends Card {

    public Empty01() {
        super();
        setAnimation(new Animation(getSprite(), 41, 42));
    }
}
