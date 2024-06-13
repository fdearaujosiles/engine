package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts09 extends Card {

    public Hearts09() {
        super();
        this.value = 9;
        setAnimation(new Animation(getSprite(), 22, 23));
    }
}
