package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs06 extends Card {

    public Clubs06() {
        super();
        this.value = 2;
        setAnimation(new Animation(getSprite(), 33, 34));
    }
}
