import java.util.Random;

public class Dice {

        int numberOfDice;

        Random rand = new Random(1);

       public Dice(int numberOfDice){
           this.numberOfDice= numberOfDice;
       }



       public int tossSum(){
           int diceThrow= 0;
           for (int i = 0; i <numberOfDice; i++){
               int roll= rand.nextInt(6)+1; // random number integer with bound of 6
               diceThrow += roll;
           }
        return diceThrow;
       }

    }



