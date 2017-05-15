package offer;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class ThreeForTwo implements SpecialOffer {

    public double applyOffer(int numberOfItems, double price) {
        if(numberOfItems > 0) {
            int rest = numberOfItems % 3;
            return ((numberOfItems - rest) / 3) * price * 2 + (rest * price);
        } else {
            return 0;
        }
    }
}
