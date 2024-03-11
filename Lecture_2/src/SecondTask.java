import java.util.Scanner;

public class SecondTask {
    public void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Diff = " + (num1 - num2));
        System.out.println("Prod = " + (num1 * num2));
    }
}
