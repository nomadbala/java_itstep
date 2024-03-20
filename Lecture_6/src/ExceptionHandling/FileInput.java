package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void getFile(String filePath) throws Exception {
        try {
            FileInputStream fiStream = new FileInputStream(filePath);
            fiStream.read();
        }
        catch (FileNotFoundException exception) {

        }
        catch (IOException exception2) {

        }
    }
}
