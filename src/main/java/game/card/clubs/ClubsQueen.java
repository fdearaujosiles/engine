package game.card.clubs;

import game.card.Card;
import engine.sprite.Animation;

public class ClubsQueen extends Card {

    public ClubsQueen() {
        super();
        this.value = 10;
        setAnimation(new Animation(getSprite(), 39, 40));
    }
}