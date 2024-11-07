package game.card;

import engine.error.EngineRuntimeException;

import static java.util.Objects.isNull;

public class CardEffect {

    private int value = 404;
    private Effect effect;

    public CardEffect(CardValue cardValue) {
        getEffect(cardValue);
    }

    private void getEffect(CardValue cardValue) {
        switch (cardValue) {
            case SpadesAce, ClubsAce, DiamondsAce, HeartsAce -> {
                value = 1;
            }
            case Spades02, Clubs02, Diamonds02, Hearts02 -> {
                value = 2;
            }
            case Spades03, Clubs03, Diamonds03, Hearts03 -> {
                value = 3;
            }
            case Spades04, Clubs04, Diamonds04, Hearts04 -> {
                value = 4;
            }
            case Spades05, Clubs05, Diamonds05, Hearts05 -> {
                value = 5;
            }
            case Spades06, Clubs06, Diamonds06, Hearts06 -> {
                value = 6;
            }
            case Spades07, Clubs07, Diamonds07, Hearts07 -> {
                value = 7;
                effect = Effect.PEEK_SELF;
            }
            case Spades08, Clubs08, Diamonds08, Hearts08 -> {
                value = 8;
                effect = Effect.PEEK_SELF;
            }
            case Spades09, Clubs09, Diamonds09, Hearts09 -> {
                value = 9;
                effect = Effect.PEEK_OTHER;
            }
            case Spades10, Clubs10, Diamonds10, Hearts10 -> {
                value = 10;
                effect = Effect.PEEK_OTHER;
            }
            case SpadesJack, ClubsJack, DiamondsJack, HeartsJack, SpadesKing, ClubsKing -> {
                value = 10;
            }
            case SpadesQueen, ClubsQueen, DiamondsQueen, HeartsQueen -> {
                value = 10;
                effect = Effect.CHANGE_CARDS;
            }
            case DiamondsKing, HeartsKing -> {
                value = 0;
            }
            case Joker01, Joker02 -> {
                value = -1;
            }
        }
        if(value == 404) {
            throw new EngineRuntimeException("CardValue " + cardValue + " is not supported");
        }
    }

    public void processEffect() {
        switch (this.effect) {
            case PEEK_SELF -> peekSelf();
            case PEEK_OTHER -> peekOther();
            case CHANGE_CARDS -> changeCards();
            case null, default -> {

            }
        }
    }

    public int getValue() {
        return value;
    }

    private void peekSelf() {}

    private void peekOther() {}

    private void changeCards() {}
}
