package game.card.others;

import engine.sprite.Animation;
import game.card.Card;

public class Joker01 extends Card {

    public Joker01() {
        super();
        this.value = -1;
        setAnimation(new Animation(getSprite(), 13, 14));
    }
}
