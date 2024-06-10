package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts04 extends Card {

    public Hearts04() {
        super();
        setAnimation(new Animation(getSprite(), 17, 18));
    }
}
