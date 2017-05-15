package offer;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class Bogof implements SpecialOffer {

    public double applyOffer(int numberOfItems, double price) {
        if(numberOfItems > 0) {
            int rest = numberOfItems % 2;
            return ((numberOfItems - rest) / 2 + rest) * price;
        } else {
            return 0;
        }
    }
}
