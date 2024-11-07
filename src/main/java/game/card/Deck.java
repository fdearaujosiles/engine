package game.card;

import game.utils.constants.Sprites;
import engine.game_object.GameObject;
import java.util.ArrayList;

import static engine.utils.functions.Utils.shuffleArray;
import static game.card.CardValue.*;

public class Deck extends GameObject {

    private final ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        super();
        setSprite(Sprites.DECKBACKS, 7, 4);
        setAnimation(22, 23);

        addNewDeck();
        shuffle();
    }

    public void shuffle() {
        for(int i=0; i<15; i++) shuffleArray(cards);
    }

    public Card drawCard() {
        if(cards.isEmpty()) return null;
        return cards.removeFirst();
    }

    public void addCard(CardValue value) {
        Card newCard = new Card(value);
        cards.add(newCard);
        newCard.setState(Card.State.ON_DECK);
    }

    private void addNewDeck() {
        addCard(SpadesAce);
        addCard(Spades02);
        addCard(Spades03);
        addCard(Spades04);
        addCard(Spades05);
        addCard(Spades06);
        addCard(Spades07);
        addCard(Spades08);
        addCard(Spades09);
        addCard(Spades10);
        addCard(SpadesJack);
        addCard(SpadesQueen);
        addCard(SpadesKing);
        addCard(HeartsAce);
        addCard(Hearts02);
        addCard(Hearts03);
        addCard(Hearts04);
        addCard(Hearts05);
        addCard(Hearts06);
        addCard(Hearts07);
        addCard(Hearts08);
        addCard(Hearts09);
        addCard(Hearts10);
        addCard(HeartsJack);
        addCard(HeartsQueen);
        addCard(HeartsKing);
        addCard(ClubsAce);
        addCard(Clubs02);
        addCard(Clubs03);
        addCard(Clubs04);
        addCard(Clubs05);
        addCard(Clubs06);
        addCard(Clubs07);
        addCard(Clubs08);
        addCard(Clubs09);
        addCard(Clubs10);
        addCard(ClubsJack);
        addCard(ClubsQueen);
        addCard(ClubsKing);
        addCard(DiamondsAce);
        addCard(Diamonds02);
        addCard(Diamonds03);
        addCard(Diamonds04);
        addCard(Diamonds05);
        addCard(Diamonds06);
        addCard(Diamonds07);
        addCard(Diamonds08);
        addCard(Diamonds09);
        addCard(Diamonds10);
        addCard(DiamondsJack);
        addCard(DiamondsQueen);
        addCard(DiamondsKing);
        addCard(Joker01);
        addCard(Joker02);
    }
}

