package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs07 extends Card {

    public Clubs07() {
        super();
        this.value = 7;
        setAnimation(new Animation(getSprite(), 34, 35));
    }
}
