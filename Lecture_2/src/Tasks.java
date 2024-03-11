import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    public void Solution_1() {
        System.out.println("Fall seven times\nand\nstand up eight");
    }

    public void Solution_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Diff = " + (num1 - num2));
        System.out.println("Prod = " + (num1 * num2));
    }

    public void Solution_3() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length() != 4) return;
        String reversed_input = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed_input += input.charAt(i);
        }
        System.out.println(reversed_input);
    }

    public void Solution_4() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0 && num <= 6) {
            System.out.println("Good night");
        } else if (num >= 6 && num <= 13) {
            System.out.println("Good Morning");
        } else if (num >= 13 && num <= 17) {
            System.out.println("Good day");
        } else if (num <= 17 && num >= 0) {
            System.out.println("Good evening");
        }
    }

    public void Solution_5() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length() != 6) return;
        List<Integer> f_part = new ArrayList<Integer>();
        List<Integer> s_part = new ArrayList<Integer>();
        for (int i = 0; i < input.length() / 2; i++) {
            f_part.add(Character.getNumericValue(input.charAt(i)));
        }
        for (int i = input.length() / 2; i < input.length(); i++) {
            s_part.add(Character.getNumericValue(input.charAt(i)));
        }

        if (sum(f_part) == sum(s_part)) {
            System.out.println("Счастливое число");
        }
        else {
            System.out.println("не счастливое чичсло");
        }
    }

    public int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public void Solution_6() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("Ошибка");
            return;
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }

    public void Solution_7() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(f(num));
    }

    public int f(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public void Solution_8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу");
        int min = scanner.nextInt();
        System.out.println("Введите верхнюю границу");
        int max = scanner.nextInt();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void Solution_9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива вот так: 1,2,3,4,5");
        String input = scanner.next();
        String[] digits = input.split(",");
        int[] num_arr = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            num_arr[i] = Integer.parseInt(digits[i]);
        }
        int sum = 0;
        for (int num : num_arr) {
            System.out.print(" " + num);
            sum += num;
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Средне ареф = " + (sum / num_arr.length));
    }

    public void Solution_10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива вот так: 1,2,3,4,5");
        String input = scanner.next();
        String[] digits = input.split(",");
        int[] num_arr = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            num_arr[i] = Integer.parseInt(digits[i]);
        }
        System.out.println("Введите число которое вы хоитте найти");
        int target = scanner.nextInt();
        int count = 0;
        for (int num : num_arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("Сколько раз это число присутсвует в этом массиве = " + count);
    }

    public void Solution_11(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void Solution_12(List<Integer> list) {
        List<Integer> f_list = new ArrayList<Integer>();
        for (int num : list) {
            f_list.add(f(num));
        }
        for (int num : f_list) {
            System.out.print(" " + num);
        }
    }

    public void num_to_bin(int num) {
        List<Integer> list = new ArrayList<Integer>();

        while (num > 0) {
            list.add(num % 2);
            num = num / 2;
        }

        for (int i : list) {
            System.out.print(" " + i);
        }
    }
}
