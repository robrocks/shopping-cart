import item.Apple;
import item.Fruit;
import offer.Bogof;

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

        return calculateTotalForBogof(numberOfApples);
    }

    private double calculateTotalForBogof(int numberOfApples) {
        Bogof bogof = new Bogof();
        return bogof.applyOffer(numberOfApples, new Apple().getPrice());
    }
}
