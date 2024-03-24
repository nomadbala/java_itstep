import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,78,1,2,3,5,6,123,5,76,9};

        printArr(arr);

        System.out.println(getMaxInArr(arr));

        sortArr(arr);

        printArr(arr);
    }

    public static <T extends Comparable<T>> void printArr(T[] mas) {
        for (T num : mas) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static <T extends Comparable<T>> T getMin(T a, T b, T c, T d, T e) {
        T min = a;

        if (b.compareTo(min) < 0) {
            min = b;
        }
        if (c.compareTo(min) < 0) {
            min = c;
        }
        if (d.compareTo(min) < 0) {
            min = d;
        }
        if (e.compareTo(min) < 0) {
            min = e;
        }

        return min;
    }

    public static <T extends Number> double getAvg(T[] mas) {
        double sum = 0.0;

        for (T num : mas) {
            sum += num.doubleValue();
        }

        return sum / mas.length;
    }

    public static <T extends Comparable<T>> T getMaxInArr(T[] mas) {
        T max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i].compareTo(max) > 0) {
                max = mas[i];
            }
        }

        return max;
    }

    public static <T extends Comparable<T>> T getMinInArr(T[] mas) {
        T min = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i].compareTo(min) < 0) {
                min = mas[i];
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> void sortArr(T[] mas) {
        Arrays.sort(mas);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = array[mid].compareTo(key);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}