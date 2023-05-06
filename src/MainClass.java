import org.junit.Assert;

public class MainClass {
    private String class_string = "Hello, world";
    public void getClassString () {
        String s = class_string;
        System.out.println(s);

    }
    private int class_number = 20;
    public int getClassNumber(){
        int expected = 20;
        int actual = class_number;
        Assert.assertTrue("Wrong result",actual==expected);
        return actual;
    }
    public int getLocalNumber(int a){
        if (a == 14){
            System.out.println("Correct number");
            return a;
        } else {
            this.typeAnError("This is wrong number (expected 14)");
            return 0;
        }
    }

    private int typeAnError(String error_message){
        System.out.println(error_message);
        return 0;
    }
}
