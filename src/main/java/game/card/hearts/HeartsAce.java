package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class HeartsAce extends Card {

    public HeartsAce() {
        super();
        this.value = 1;
        setAnimation(new Animation(getSprite(), 14, 15));
    }
}
