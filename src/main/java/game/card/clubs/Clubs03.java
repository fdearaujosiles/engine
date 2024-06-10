package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs03 extends Card {

    public Clubs03() {
        super();
        setAnimation(new Animation(getSprite(), 30, 31));
    }
}
