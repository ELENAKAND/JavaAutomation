import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber(){
        int number_1 = 45;
        int number_2 = this.getClassNumber();
        Assert.assertTrue("Number less than 45",number_2>number_1);

    }
    @Test
    public void testGetLocalNumber(){
        int number = this.getLocalNumber(10);
        System.out.println(number);

    }

}
