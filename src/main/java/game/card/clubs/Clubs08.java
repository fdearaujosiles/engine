package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs08 extends Card {

    public Clubs08() {
        super();
        this.value = 8;
        setAnimation(new Animation(getSprite(), 35, 36));
    }
}
