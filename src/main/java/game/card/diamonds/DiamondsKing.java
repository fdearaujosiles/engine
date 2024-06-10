package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class DiamondsKing extends Card {

    public DiamondsKing() {
        super();
        setAnimation(new Animation(getSprite(), 54, 55));
    }
}
