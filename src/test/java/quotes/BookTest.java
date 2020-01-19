package quotes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    Book testBook;

    @Before
    public void setUp () {
        testBook = new Book ("src/main/resources/recentquotes.json");
    }

    @Test
    public void testBookConstructor () {
        Assert.assertEquals("src/main/resources/recentquotes.json", testBook.bookPath);
    }
}
