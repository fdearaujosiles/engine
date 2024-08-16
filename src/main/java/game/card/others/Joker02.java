package game.card.others;

import engine.sprite.Animation;
import game.card.Card;

public class Joker02 extends Card {

    public Joker02() {
        super();
        this.value = -1;
        setAnimation(new Animation(getSprite(), 27, 28));
    }
}
