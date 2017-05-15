import item.Apple;
import item.Fruit;
import item.Orange;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class CheckoutTest extends TestCase {

    Checkout sut = new Checkout();

    @Test
    public void testCalculateTotal() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>();
        Fruit[] testItems = new Fruit[] {
                new Apple(),
                new Apple(),
                new Orange(),
                new Apple(),
        };
        listOfTestItems.addAll(Arrays.asList(testItems));

        assertThat(sut.calculateTotal(listOfTestItems), is(2.05));
    }

    @Test
    public void testCalculateTotalWithOffers() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>();
        Fruit[] testItems = new Fruit[] {
                new Apple(),
                new Apple(),
                new Orange(),
                new Apple(),
        };
        listOfTestItems.addAll(Arrays.asList(testItems));

        assertThat(sut.calculateTotalWithOffers(listOfTestItems), is(1.45));
    }

    @Test
    public void testCalculateTotalWithOffers_MoreOranges() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>();
        Fruit[] testItems = new Fruit[] {
                new Apple(),
                new Apple(),
                new Orange(),
                new Apple(),
                new Orange(),
                new Orange(),
        };
        listOfTestItems.addAll(Arrays.asList(testItems));

        assertThat(sut.calculateTotalWithOffers(listOfTestItems), is(1.70));
    }
}
