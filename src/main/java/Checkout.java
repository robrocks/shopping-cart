import item.Apple;
import item.Fruit;
import item.Orange;
import offer.Bogof;
import offer.SpecialOffer;
import offer.ThreeForTwo;

import java.util.ArrayList;

/**
 * Created by rr.t3ch on 15/05/17.
 */
public class Checkout {

    public double calculateTotal(ArrayList<Fruit> listOfItemsScanned) {
        double totalPrice = 0;

        for (Fruit item: listOfItemsScanned) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public double calculateTotalWithOffers(ArrayList<Fruit> listOfItemsScanned) {
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (Fruit item: listOfItemsScanned) {
            if (item instanceof Apple) {
                numberOfApples++;
            } else {
                numberOfOranges++;
            }
        }

        Bogof bogof = new Bogof();
        ThreeForTwo threeForTwo = new ThreeForTwo();

        return calculateOffer(numberOfApples, new Apple().getPrice(), bogof)
                + calculateOffer(numberOfOranges, new Orange().getPrice(), threeForTwo);
    }

    private double calculateOffer(int numberOfFruits, double price, SpecialOffer offer) {
        return offer.applyDiscount(numberOfFruits, price);
    }
}
