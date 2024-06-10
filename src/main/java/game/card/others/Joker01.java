package game.card.others;

import game.card.Card;
import engine.sprite.Animation;

public class Joker01 extends Card {

    public Joker01() {
        super();
        setAnimation(new Animation(getSprite(), 13, 14));
    }
}
