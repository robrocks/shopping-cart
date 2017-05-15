import item.Fruit;

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
}
