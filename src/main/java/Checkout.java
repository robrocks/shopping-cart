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
        double totalPrice = 0;

        for (Fruit item: listOfItemsScanned) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public double calculateTotal(List<Fruit> listOfItemsScanned, Map<String, SpecialOffer> offers) {
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (Fruit item: listOfItemsScanned) {
            if (item instanceof Apple) {
                numberOfApples++;
            } else {
                numberOfOranges++;
            }
        }

        return calculateOffer(numberOfApples, new Apple().getPrice(), offers.get("Apple"))
                + calculateOffer(numberOfOranges, new Orange().getPrice(), offers.get("Orange"));
    }

    private double calculateOffer(int numberOfFruits, double price, SpecialOffer offer) {
        return offer.applyDiscount(numberOfFruits, price);
    }
}
