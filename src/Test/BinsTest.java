import org.junit.Assert;
import org.junit.Test;

public class BinsTest{
    @Test
    public void getBinsTest(){
        int expected= 1;

        Bins bin = new Bins (2,12);

        bin.increment(10);

        int actual=bin.getBin(10);

        Assert.assertEquals(expected,actual);


    }

}