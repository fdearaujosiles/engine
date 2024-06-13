package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class HeartsKing extends Card {

    public HeartsKing() {
        super();
        this.value = 0;
        setAnimation(new Animation(getSprite(), 26, 27));
    }
}
