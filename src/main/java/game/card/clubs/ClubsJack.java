package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class ClubsJack extends Card {

    public ClubsJack() {
        super();
        setAnimation(new Animation(getSprite(), 38, 39));
    }
}
