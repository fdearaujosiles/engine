package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class ClubsKing extends Card {

    public ClubsKing() {
        super();
        setAnimation(new Animation(getSprite(), 40, 41));
    }
}
