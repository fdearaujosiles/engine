package game.card.others;

import game.card.Card;
import engine.sprite.Animation;

public class Joker02 extends Card {

    public Joker02() {
        super();
        setAnimation(new Animation(getSprite(), 27, 28));
    }
}
