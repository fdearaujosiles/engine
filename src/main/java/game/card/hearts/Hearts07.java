package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts07 extends Card {

    public Hearts07() {
        super();
        this.value = 7;
        setAnimation(new Animation(getSprite(), 20, 21));
    }
}
