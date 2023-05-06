import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        int number = this.getLocalNumber(10);
        System.out.println(number);

    }

}
