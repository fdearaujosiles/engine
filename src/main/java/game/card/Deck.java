package game.card;

import engine.controller.MouseInputListener;
import engine.utils.constants.Sprites;
import engine.gameObject.GameObject;
import game.card.clubs.*;
import game.card.diamonds.*;
import game.card.hearts.*;
import game.card.others.Joker01;
import game.card.others.Joker02;
import game.card.spades.*;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import static engine.utils.functions.Utils.shuffleArray;

public class Deck extends GameObject {

    private ArrayList<Card> cards;

    public Deck() {
        super();
        setSprite(Sprites.DECKBACKS, 7, 4);
        setAnimation(23, 24);

        getNewDeck();
    }

    public void shuffle() {
        for(int i=0; i<15; i++) shuffleArray(cards);
    }

    public Card drawCard() {
        return cards.removeFirst();
    }

    public void addCard(Card card) {
        cards.add(card);
        card.setState(Card.State.OnDeck);
    }

    private void getNewDeck() {
        cards = new ArrayList<>();
        addCard(new SpadesAce());
        addCard(new Spades02());
        addCard(new Spades03());
        addCard(new Spades04());
        addCard(new Spades05());
        addCard(new Spades06());
        addCard(new Spades07());
        addCard(new Spades08());
        addCard(new Spades09());
        addCard(new Spades10());
        addCard(new SpadesJack());
        addCard(new SpadesQueen());
        addCard(new SpadesKing());
        addCard(new HeartsAce());
        addCard(new Hearts02());
        addCard(new Hearts03());
        addCard(new Hearts04());
        addCard(new Hearts05());
        addCard(new Hearts06());
        addCard(new Hearts07());
        addCard(new Hearts08());
        addCard(new Hearts09());
        addCard(new Hearts10());
        addCard(new HeartsJack());
        addCard(new HeartsQueen());
        addCard(new HeartsKing());
        addCard(new ClubsAce());
        addCard(new Clubs02());
        addCard(new Clubs03());
        addCard(new Clubs04());
        addCard(new Clubs05());
        addCard(new Clubs06());
        addCard(new Clubs07());
        addCard(new Clubs08());
        addCard(new Clubs09());
        addCard(new Clubs10());
        addCard(new ClubsJack());
        addCard(new ClubsQueen());
        addCard(new ClubsKing());
        addCard(new DiamondsAce());
        addCard(new Diamonds02());
        addCard(new Diamonds03());
        addCard(new Diamonds04());
        addCard(new Diamonds05());
        addCard(new Diamonds06());
        addCard(new Diamonds07());
        addCard(new Diamonds08());
        addCard(new Diamonds09());
        addCard(new Diamonds10());
        addCard(new DiamondsJack());
        addCard(new DiamondsQueen());
        addCard(new DiamondsKing());
        addCard(new Joker01());
        addCard(new Joker02());
        shuffle();
    }
}

