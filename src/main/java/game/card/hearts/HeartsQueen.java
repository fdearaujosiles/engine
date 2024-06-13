package game.card.hearts;

import game.card.Card;
import engine.sprite.Animation;

public class HeartsQueen extends Card {

    public HeartsQueen() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 25, 26));
    }
}
