package offer;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class BogofTest {

    @Test
    public void testApplyOfferOnApples() {
        Bogof sut = new Bogof();
        assertThat(sut.applyDiscount(2,0.6), is(0.6));
        assertThat(sut.applyDiscount(3,0.6), is(1.2));
        assertThat(sut.applyDiscount(4,0.6), is(1.2));
    }
}
