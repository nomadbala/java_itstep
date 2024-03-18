import java.util.Collections;
import java.util.Scanner;

public class TaskManager {
    Scanner scanner = new Scanner(System.in);

    public void Solution_1() {
        System.out.println("“Your time is limited,\n\tso don`t waste it\n\t\tliving someone else`s life”\n\t\t\tSteve Jobs");
    }

    public void Solution_2() {
        System.out.println("Input first number");
        int number = scanner.nextInt();
        System.out.println("Input second number");
        int percent = scanner.nextInt();
        double result = (number * percent) / 100;
        System.out.println(percent + "procents out of " + number + " is " + result);
    }

    public void Solution_3() {
        System.out.println("Input your numbers");
        String[] digits = scanner.next().split(",");
        String result = String.join("", digits);
        System.out.println(result);
    }

    public void Solution_4() {
        System.out.println("Input 6-digit number");
        String[] input = scanner.nextLine().split("");
        String temp = input[0];
        input[0] = input[input.length - 1];
        input[input.length -  1] = temp;
        for (String num : input) {
            System.out.print(num);
        }
    }

    public void Solution_5() {
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Incorrect month number");
            return;
        }

        String month = "";

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                month = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                month = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                month = "Summer";
            default:
                month = "Autumn";
        }

        System.out.println(month);
    }

    public void Solution_6() {
        System.out.println("Input meters");
        int meters = scanner.nextInt();


    }
}
