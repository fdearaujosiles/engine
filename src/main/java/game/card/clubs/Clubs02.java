package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class Clubs02 extends Card {

    public Clubs02() {
        super();
        setAnimation(new Animation(getSprite(), 29, 30));
    }
}
