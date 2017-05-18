import item.Apple;
import item.Fruit;
import item.Orange;
import offer.SpecialOffer;

import java.util.List;
import java.util.Map;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class Checkout {

    public double calculateTotal(List<Fruit> listOfItemsScanned) {

        return listOfItemsScanned.stream()
                .mapToDouble(item -> item.getPrice())
                .sum();
    }

    public double calculateTotal(List<Fruit> listOfItemsScanned, Map<String, SpecialOffer> offers) {
        long numberOfApples = listOfItemsScanned.stream()
                .filter(item -> item instanceof Apple)
                .count();

        return calculateOffer(numberOfApples, new Apple().getPrice(), offers.get("Apple"))
                + calculateOffer(listOfItemsScanned.size() - numberOfApples,
                                    new Orange().getPrice(),
                                    offers.get("Orange")
                );
    }

    private double calculateOffer(long numberOfFruits, double price, SpecialOffer offer) {
        return offer.applyDiscount(numberOfFruits, price);
    }
}
