package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class ClubsAce extends Card {

    public ClubsAce() {
        super();
        this.value = 1;
        setAnimation(new Animation(getSprite(), 28, 29));
    }
}
