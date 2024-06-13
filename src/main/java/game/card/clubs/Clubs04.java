package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs04 extends Card {

    public Clubs04() {
        super();
        this.value = 4;
        setAnimation(new Animation(getSprite(), 31, 32));
    }
}
