package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades04 extends Card {

    public Spades04() {
        super();
        setAnimation(new Animation(getSprite(), 3, 4));
    }
}
