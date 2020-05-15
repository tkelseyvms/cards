public class Deck {

    private Card[] deck;
    private int bean = 4;
    private int bean1 = 13;
    private in deckSize = 52;

    public Deck(){

        deck = new card[52];
        for(int i = 0; i < bean; i++){

            for(int i = 1; i <= bean1; i++){

                deck[i] = new Card(bean, bean1);

            }

        }

    }

    public card Deal(){

        if(deckSize == 0){

            println("The Deck is done buddy");

        }else{

            Card given = deck[deckSize];
            deckSize--;
            return given;

        }

    }

    public void Shuffle(){

        Card[] bean = new Card[52];
        private int god = 0;

        for(i = 0; i < deckSize; i++){

            god = (int)(math.random * deckSize);

            bean[0] = deck[god];
            bean[1] = deck[i];
            deck[god] = bean[1];
            deck[i] = bean[0];
s
        }

    }

}
