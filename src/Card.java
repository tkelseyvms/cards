public class Card {

    private Rank rank;
    private Suit suit;

    public card(int rank, int suit){

        if(rank < 2){

            rank = new Rank("Ace", rank);

        }else{

            if(rank < 11)
            {

                rank = new Rank("" + rank, rank);

            }else{

                if(rank == 11){

                    rank = new Rank("Jack", rank);

                }
                if(rank == 12){

                    rank = new Rank("Queen", rank);

                }
                if(rank == 13){

                    rank = new Rank("King", rank);

                }

            }

        }

        if(suit == 0){

            suit = new Suit("Spades");

        }else if(suit == 1){

            suit = new Suit("Clubs");

        }else if(suit == 2){

            suit = new Suit("Diamonds");

        }else{

            suit = new Suit("Hearts");

        }

    }


    public String toString(){

        return rank + " of " + suit;

    }

}
