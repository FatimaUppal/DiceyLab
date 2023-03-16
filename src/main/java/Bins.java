import java.beans.PropertyEditorSupport;
import java.util.ArrayList;

public class Bins {
    int min; //2
    int max; //12

    int [] bins; //integer array for bins
    public Bins(int min, int max){ //constructor that takes 2 arguments (min,max)
        this.min=min;
        this.max=max;
        bins= new int [max + 1- min];// creates a new integer array where the size difference in the min and max + 1 because its inclusive
    }
    public int getBin(int bin){ // returns the count stored in the bin by subtracting the min from the bin
        return bins[bin-min];
    }
    public void increment(int bin){ // adds the to the increment by 1
        bins[bin-min]+= 1;
    }
}


