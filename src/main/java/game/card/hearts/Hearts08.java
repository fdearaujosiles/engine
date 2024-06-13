package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts08 extends Card {

    public Hearts08() {
        super();
        this.value = 8;
        setAnimation(new Animation(getSprite(), 21, 22));
    }
}
