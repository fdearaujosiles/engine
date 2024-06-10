package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class ClubsAce extends Card {

    public ClubsAce() {
        super();
        setAnimation(new Animation(getSprite(), 28, 29));
    }
}
