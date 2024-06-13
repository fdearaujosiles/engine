package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs05 extends Card {

    public Clubs05() {
        super();
        this.value = 5;
        setAnimation(new Animation(getSprite(), 32, 33));
    }
}
