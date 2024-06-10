package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class SpadesQueen extends Card {

    public SpadesQueen() {
        super();
        setAnimation(new Animation(getSprite(), 11, 12));
    }
}
