package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class Hearts05 extends Card {

    public Hearts05() {
        super();
        this.value = 5;
        setAnimation(new Animation(getSprite(), 18, 19));
    }
}
