import item.Apple;
import item.Fruit;
import item.Orange;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class CheckoutTest extends TestCase {

    Checkout sut = new Checkout();

    @Test
    public void testCalculateTotal() {
        ArrayList<Fruit> listOfTestItems = new ArrayList<Fruit>();
        Fruit[] testItems = new Fruit[] {
                new Apple(),
                new Apple(),
                new Orange(),
                new Apple(),
        };
        listOfTestItems.addAll(Arrays.asList(testItems));

        assertThat(sut.calculateTotal(listOfTestItems), is(2.05));
    }
}
