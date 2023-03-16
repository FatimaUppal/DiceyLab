import java.awt.*;
import java.util.Scanner;

public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    Bins result;

    public Simulation( int numberOfDice, int numberOfTosses){
        this.numberOfDice=numberOfDice;
        this.numberOfTosses=numberOfTosses;
        dice=new Dice(numberOfDice);
        this.result=new Bins(2,12);
    }

    public static void main (String[]args){
    Simulation sim= new Simulation(2,1000000);
    sim.runSim();
    sim.printResult();
    }


    public void runSim(){
        for (int i= 1; i<=numberOfTosses; i++){
           int num=  dice.tossSum();
           result.increment(num);
        }
    }
    public void printResult(){
        System.out.println("***");
        System.out.println("Simulation of " +numberOfDice+ " dice tossed " +numberOfTosses+ " times");
        System.out.println("***\n");

        int binResult= 0;
        int results = 0;

        for (int i=2; i<=12; i++){
            binResult=i;
            results= result.getBin(i);
            double percent= ((double) results/numberOfTosses);

            System.out.printf("%2d : %6d : %.2f ************\n", binResult, results, percent);

        }

     }
}










