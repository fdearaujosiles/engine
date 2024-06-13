package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class DiamondsKing extends Card {

    public DiamondsKing() {
        super();
        this.value = 0;
        setAnimation(new Animation(getSprite(), 54, 55));
    }
}
