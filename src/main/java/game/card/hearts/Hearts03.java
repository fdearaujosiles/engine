package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts03 extends Card {

    public Hearts03() {
        super();
        this.value = 3;
        setAnimation(new Animation(getSprite(), 16, 17));
    }
}
