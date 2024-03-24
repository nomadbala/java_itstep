public class Array implements IShow, IMath, ISort {
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    @Override
    public void Print() {
        for (int item : arr) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        Print();
        System.out.println("info = " + info);
    }

    @Override
    public int Max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (float) sum / arr.length;
    }

    @Override
    public void SortAsc() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void SortDesc() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
