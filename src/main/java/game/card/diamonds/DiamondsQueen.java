package game.card.diamonds;

import game.card.Card;
import engine.sprite.Animation;

public class DiamondsQueen extends Card {

    public DiamondsQueen() {
        super();
        setAnimation(new Animation(getSprite(), 53, 54));
    }
}
