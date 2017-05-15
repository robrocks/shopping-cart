package offer;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class ThreeForTwoTest {

    @Test
    public void testApplyOfferOnOranges() {
        ThreeForTwo sut = new ThreeForTwo();
        assertThat(sut.applyDiscount(3,0.25), is(0.5));
        assertThat(sut.applyDiscount(4,0.25), is(0.75));
        assertThat(sut.applyDiscount(5,0.25), is(1.0));
        assertThat(sut.applyDiscount(6,0.25), is(1.0));
    }
}
