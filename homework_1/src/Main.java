import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter amount of spiral layers");
//        int layersAmount = scanner.nextInt();
//        System.out.println("Enter symbol for layer");
//        String spiralSymbol =  scanner.next();
//
//        Spiral(layersAmount, spiralSymbol);
        int slom = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = slom - 1; i < 2 * slom - 1; i += (i % 2 == 0) ? 1 : -1, j -= (i % 2 == 0) ? 1 : -1) {
            for (int k = 0; k < slom - Math.abs(i - slom + 1); k++) {
                sb.append((i + k + j - slom + 2) % 2 == 0 ? "x" : " ");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }

    private static void Spiral(int layers, String symbol) {
        int size = layers * 2 - 1;
        char[][] spiral = new char[size][size];

        int left = 0, right = size - 1, top = 0, bottom = size - 1;
        int num = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = (char) ('0' + num % 10);
                num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = (char) ('0' + num % 10);
                num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = (char) ('0' + num % 10);
                    num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = (char) ('0' + num % 10);
                    num++;
                }
                left++;
            }
        }

        // Вывод спирали
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (spiral[i][j] == 0) {
                    System.out.print("  "); // Для пропуска пустых элементов
                } else {
                    System.out.print(spiral[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}