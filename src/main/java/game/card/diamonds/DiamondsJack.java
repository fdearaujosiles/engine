package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class DiamondsJack extends Card {

    public DiamondsJack() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 52, 53));
    }
}
