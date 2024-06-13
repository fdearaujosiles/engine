package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class Spades04 extends Card {

    public Spades04() {
        super();
        this.value = 4;
        setAnimation(new Animation(getSprite(), 3, 4));
    }
}
