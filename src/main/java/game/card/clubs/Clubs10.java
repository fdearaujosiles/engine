package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs10 extends Card {

    public Clubs10() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 37, 38));
    }
}
