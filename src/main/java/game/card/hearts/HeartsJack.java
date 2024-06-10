package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class HeartsJack extends Card {

    public HeartsJack() {
        super();
        setAnimation(new Animation(getSprite(), 24, 25));
    }
}
