package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts06 extends Card {

    public Hearts06() {
        super();
        this.value = 6;
        setAnimation(new Animation(getSprite(), 19, 20));
    }
}
