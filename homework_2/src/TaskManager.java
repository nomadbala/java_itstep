import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
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
        double meters = scanner.nextDouble();

        System.out.println("Choose miles, inch or yards");
        String choise = scanner.nextLine();

        double result = 0;

        switch (choise) {
            case "miles":
                result = meters / 1609;
                break;
            case "inch":
                result = meters * 39.37;
                break;
            case "yards":
                result = meters * 1.094;
                break;
        }

        System.out.println("result = " + result);
    }

    public void Solution_7() {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("Boundaries normalized. New range: " + num1 + " to " + num2);
        }

        System.out.println("Odd numbers in the range [" + num1 + ", " + num2 + "]:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void Solution_8() {
        System.out.println("Enter the starting number:");
        int startNum = scanner.nextInt();
        System.out.println("Enter the ending number:");
        int endNum = scanner.nextInt();

        if (startNum > endNum) {
            int temp = startNum;
            startNum = endNum;
            endNum = temp;
            System.out.println("Boundaries swapped. New range: " + startNum + " to " + endNum);
        }

        for (int i = startNum; i <= endNum; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void Solution_9() {
        int size = 10;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулевых элементов: " + zeroCount);
    }

    public void Solution_10() {
        int size = 10;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int[] negativeArray = new int[size];
        int[] positiveArray = new int[size];

        int evenIndex = 0;
        int oddIndex = 0;
        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenIndex++] = array[i];
            } else {
                oddArray[oddIndex++] = array[i];
            }
            if (array[i] < 0) {
                negativeArray[negativeIndex++] = array[i];
            } else if (array[i] > 0) {
                positiveArray[positiveIndex++] = array[i];
            }
        }

        evenArray = Arrays.copyOf(evenArray, evenIndex);
        oddArray = Arrays.copyOf(oddArray, oddIndex);
        negativeArray = Arrays.copyOf(negativeArray, negativeIndex);
        positiveArray = Arrays.copyOf(positiveArray, positiveIndex);

        System.out.println("Массив четных чисел: " + Arrays.toString(evenArray));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(oddArray));
        System.out.println("Массив отрицательных чисел: " + Arrays.toString(negativeArray));
        System.out.println("Массив положительных чисел: " + Arrays.toString(positiveArray));
    }

    public void Solution_11(int length, String direction, char symbol) {
        if (direction.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println(); // Переходим на новую строку после отрисовки горизонтальной линии
        } else if (direction.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol); // Печатаем символ в каждой строке для создания вертикальной линии
            }
        } else {
            System.out.println("Invalid direction. Please specify 'horizontal' or 'vertical'.");
        }
    }

    public void Solution_12() {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter 'true' to sort the array in ascending order or 'false' to sort in descending order:");
        boolean ascending = scanner.nextBoolean();

        sortArray(array, ascending);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

    private void sortArray(int[] arr, boolean ascending) {
        if (ascending) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr);
            reverseArray(arr);
        }
    }

    private void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
