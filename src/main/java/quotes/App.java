/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

//import com.google.gson.Gson;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public static void main(String[] args) {

//        Book book = new Book ("src/main/resources/recentquotes.json");
//        String qu = readBookQuote(book);
//        System.out.println(qu);

        findQuoteOnline();

    }

    public static String findQuoteOnline () {
        try {
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");

            try {
                HttpURLConnection connect = (HttpURLConnection) url.openConnection();
                BufferedReader apiReturn = new BufferedReader(new InputStreamReader(connect.getInputStream()));
                String quote = apiReturn.readLine();
                while (quote != null) {
                    System.out.println(quote + " ~ Ron Swanson");
                }

            } catch (IOException e) {
                System.out.println("IDK where the internet went");
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            System.out.println("Use a real URL please");
            e.printStackTrace();
        }



        return null;
    }

    public static String readBookQuote (Book book) {
        Gson gson = new Gson();
        try {
            Reader bookReader = new FileReader(book.bookPath);
            Quote[] bookQuotes = gson.fromJson(bookReader, Quote[].class);
            int quoteAt = generateRandomInt(bookQuotes.length);
            return gson.toJson(bookQuotes[quoteAt].toString());
            //do the random number thing here
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int generateRandomInt (int max) {
        return (int) Math.floor(Math.random() * max);
    }
}
