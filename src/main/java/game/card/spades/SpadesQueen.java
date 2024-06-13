package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class SpadesQueen extends Card {

    public SpadesQueen() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 11, 12));
    }
}
