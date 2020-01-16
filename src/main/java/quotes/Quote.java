package quotes;

public class Quote {
    //instance variables
    String author;
    String quote;

    //Constructor function
    Quote (String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    //instance methods
    public String toString () {
        return this.quote + " ~ " + this.author;
    }

}
