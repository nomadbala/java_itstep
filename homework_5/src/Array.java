import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Comparable<T>> {
    private T[] items;

    public Array(int size) {
        items = (T[]) new Comparable[size];
    }

    public void fillArray() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < items.length; i++) {
            items[i] = (T) scanner.next();
        }
    }

    public void randomFillArray() {
        Random rnd = new Random();
        for (int i = 0; i < items.length; i++) {
            items[i] = (T) (Integer.valueOf(rnd.nextInt(1000)));
        }
    }

    public void showArray() {
        for (T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public T max() {
        T max = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i].compareTo(max) > 0) {
                max = items[i];
            }
        }

        return max;
    }

    public T min() {
        T min = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i].compareTo(min) < 0) {
                min = items[i];
            }
        }

        return min;
    }

    public double avg() {
        double sum = 0;
        for (T element : items) {
            sum += Double.parseDouble(element.toString());
        }
        return sum / items.length;
    }

    public void sortAsc() {
        Arrays.sort(items);
    }

    public void sortDesc() {
        Arrays.sort(items, (a, b) -> b.compareTo(a));
    }

    public int binarySearch(T key) {
        int left = 0;
        int right = items.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = items[mid].compareTo(key);
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

    public void replace(T oldValue, T newValue) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(oldValue)) {
                items[i] = newValue;
            }
        }
    }

}
