/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.* ;
import java.util.*;
public class App {


    public static void main(String args[]) throws IOException {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        try {
            inFile = new FileInputStream("src/main/java/linter/gates.js");
            outFile = new FileOutputStream("src/main/java/linter/outPut.js");

            int content;
            int readFile = inFile.read();
            while ((content = inFile.read()) != -1) {
                outFile.write(content);
            }

        }finally {
            if (inFile != null) {
                outFile.close();
            }
            if (outFile != null) {
                outFile.close();
            }
        }
    }

    // 1. function to test the semi column


}
