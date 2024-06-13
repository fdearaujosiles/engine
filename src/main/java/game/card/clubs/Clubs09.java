package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs09 extends Card {

    public Clubs09() {
        super();
        this.value = 9;
        setAnimation(new Animation(getSprite(), 36, 37));
    }
}
