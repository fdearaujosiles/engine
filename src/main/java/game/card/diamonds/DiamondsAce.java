package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class DiamondsAce extends Card {

    public DiamondsAce() {
        super();
        this.value = 1;
        setAnimation(new Animation(getSprite(), 42, 43));
    }
}