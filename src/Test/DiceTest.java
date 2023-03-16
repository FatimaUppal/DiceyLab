import org.junit.Assert;
import org.junit.Test;
public class DiceTest{

    @Test
    public void throwDiceTest(){
    Dice die = new Dice(2);
    int expected= 9;
    int actual= die.tossSum();
    Assert.assertEquals(expected,actual);


    }

}