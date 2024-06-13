package game.card.spades;

import game.card.Card;
import engine.sprite.Animation;

public class SpadesJack extends Card {

    public SpadesJack() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 10, 11));
    }
}
