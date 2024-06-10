package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class SpadesKing extends Card {

    public SpadesKing() {
        super();
        setAnimation(new Animation(getSprite(), 12, 13));
    }
}
