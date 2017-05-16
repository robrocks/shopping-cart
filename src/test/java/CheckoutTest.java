import item.Apple;
import item.Fruit;
import item.Orange;
import junit.framework.TestCase;
import offer.Bogof;
import offer.SpecialOffer;
import offer.ThreeForTwo;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class CheckoutTest extends TestCase {

    Checkout sut = new Checkout();

    Map<String, SpecialOffer> testOffers = new HashMap<String, SpecialOffer>() {{
        put("Apple", new Bogof());
        put("Orange", new ThreeForTwo());
    }};

    @Test
    public void testCalculateTotal() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>(
                Arrays.asList(
                        new Apple(),
                        new Apple(),
                        new Orange(),
                        new Apple()
                ));

        assertThat(sut.calculateTotal(listOfTestItems), is(2.05));
    }

    @Test
    public void testCalculateTotalWithOffers() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>(
                Arrays.asList(
                        new Apple(),
                        new Apple(),
                        new Orange(),
                        new Apple()
                ));

        assertThat(sut.calculateTotal(listOfTestItems, testOffers), is(1.45));
    }

    @Test
    public void testCalculateTotalWithOffers_MoreOranges() {
        List<Fruit> listOfTestItems = new ArrayList<Fruit>(
                Arrays.asList(
                        new Apple(),
                        new Apple(),
                        new Orange(),
                        new Apple(),
                        new Orange(),
                        new Orange()
                ));

        assertThat(sut.calculateTotal(listOfTestItems, testOffers), is(1.70));
    }
}
