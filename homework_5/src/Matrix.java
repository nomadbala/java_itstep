import java.util.Scanner;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = (T[][]) new Number[rows][cols];
    }

    public void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (T) scanner.next();
            }
        }
    }

    public void fillRandom() {
        System.out.println("Randomly filling matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (T) (Double) (Math.random() * 100);
            }
        }
    }

    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> other) {
        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = (T) (Double) (this.matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue());
            }
        }
        return result;
    }

    public Matrix<T> subtract(Matrix<T> other) {
        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = (T) (Double) (this.matrix[i][j].doubleValue() - other.matrix[i][j].doubleValue());
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        Matrix<T> result = new Matrix<>(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.matrix[i][j] = (T) (Double) (result.matrix[i][j].doubleValue() + this.matrix[i][k].doubleValue() * other.matrix[k][j].doubleValue());
                }
            }
        }
        return result;
    }

    public T findMax() {
        T max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].doubleValue() > max.doubleValue()) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public T findMin() {
        T min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].doubleValue() < min.doubleValue()) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j].doubleValue();
            }
        }
        return sum / (rows * cols);
    }

    public void replaceValue(int row, int col, T newValue) {
        matrix[row][col] = newValue;
    }

    public void displayMaxMinAverage() {
        System.out.println("Max value: " + findMax());
        System.out.println("Min value: " + findMin());
        System.out.println("Average value: " + calculateAverage());
    }
}