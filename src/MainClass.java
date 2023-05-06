public class MainClass {
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
