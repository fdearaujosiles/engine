package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class HeartsAce extends Card {

    public HeartsAce() {
        super();
        setAnimation(new Animation(getSprite(), 14, 15));
    }
}
