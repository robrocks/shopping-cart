import item.Apple;
import item.Fruit;
import item.Orange;
import offer.Bogof;
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

        return calculateTotalForBogof(numberOfApples) + calculateTotalForThreeForTwo(numberOfOranges);
    }

    private double calculateTotalForBogof(int numberOfApples) {
        Bogof bogof = new Bogof();
        return bogof.applyOffer(numberOfApples, new Apple().getPrice());
    }

    private double calculateTotalForThreeForTwo(int numberOfOranges) {
        ThreeForTwo threeForTwo = new ThreeForTwo();
        return threeForTwo.applyOffer(numberOfOranges, new Orange().getPrice());
    }
}
