import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        //tasks.Solution_12(new ArrayList<Integer>(Arrays.asList(7, 5, 4, 2, 3, 4)));
//        tasks.num_to_bin(-9);
        int number = 9;
        int number2 = 5;
        int number3 = number | number2;
        int number4 = ~number3;
        System.out.println(number4);
        System.out.println(number3);
    }
}