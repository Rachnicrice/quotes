package quotes;

import org.junit.Assert;
import org.junit.Test;

public class QuoteTest {

    @Test
    public void testQuoteConstructor () {
        Quote testQuote = new Quote("Rachael Rice", "Whoever said a jar of Nutella isn't a full meal never had their wisdom teeth taken out");

        Assert.assertEquals("Rachael Rice", testQuote.author);
        Assert.assertEquals("Whoever said a jar of Nutella isn't a full meal never had their wisdom teeth taken out", testQuote.text);
    }
}
