public class Square {

    public void printSpiralArray(int enteredNumber) {
        char[][] array = getZebraArr(enteredNumber);
        printArr(array);
    }

    private int countLength(int enteredNumber) {
        if (enteredNumber == 0)
            return 0;

        return (enteredNumber - 1) * 4 + 1;
    }

    private char[][] getZebraArr(int enteredNumber) {
        int length = countLength(enteredNumber);
        char[][] array = new char[length][length];
        for (int i = 0; i < length / 2 + 1; i++) {
            if (i % 2 == 0) {
                fillArray(array, i, 'x');
            }
            else {
                fillArray(array, i, ' ');
            }
        }
        return array;
    }

    private void fillArray(char[][] array, int layer, char symbol) {
        int length = array.length;
        int rx = length / 2;
        int cx = length / 2;
        int rightSide = cx + layer;
        for (int rxi = rx - layer; rxi <= rx + layer; rxi++) {
            array[rxi][rightSide] = symbol;
        }

        int leftSide = cx - layer;
        for (int rxi = rx - layer; rxi <= rx + layer; rxi++) {
            array[rxi][leftSide] = symbol;
        }

        int topSide = rx - layer;
        for (int cxi = cx - layer; cxi <= cx + layer; cxi++) {
            array[topSide][cxi] = symbol;
        }

        int bottomSide = rx + layer;
        for (int cxi = cx - layer; cxi <= cx + layer; cxi++) {
            array[bottomSide][cxi] = symbol;
        }
    }

    private void printArr(char[][] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
