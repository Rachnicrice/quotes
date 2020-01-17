package quotes;

public class Quote {
    //instance variables
    String[] tags;
    String author;
    String likes;
    String text;

    //Constructor function
    Quote (String author, String text) {
        this.author = author;
        this.text = text;
    }

    //instance methods
    public String toString () {
        return this.text + " ~ " + this.author;
    }

}
