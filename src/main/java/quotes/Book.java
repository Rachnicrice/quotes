package quotes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Book {
    //instance variables
    Scanner bookScanner;

    //constructor function
    Book (String filePath) {
        try {
            this.bookScanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //instance methods
    public Quote generateRandomQuote () {

        return null;
    }
}
