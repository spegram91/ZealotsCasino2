package io.zipcoder.zealotscasino;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by andrewwong on 5/9/17.
 */
public class Deck {
    private ArrayList<Card> deckQue = new ArrayList<>();
    public void shuffle(){
        Collections.shuffle(deckQue);
    }

    public ArrayList<Card> getDeckQue() {
        return deckQue;
    }

    public void buildDeck(){
        for(Suit suit: Suit.values()){
            for(NumberValue numberValue: NumberValue.values()){
                Card card = new Card(numberValue.getVal(), suit.getVal());
                deckQue.add(card);
            }
            for(FaceValue faceValue: FaceValue.values()){
                Card card = new Card(faceValue.getVal(), suit.getVal());
                deckQue.add(card);
            }
        }
    }
//    public Card getCard(){
//        Card card;
//        return card;
//    }
}
