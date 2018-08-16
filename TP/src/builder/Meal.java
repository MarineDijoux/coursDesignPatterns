package builder ;

import java.util.ArrayList;

public class Meal {

    public ArrayList<Item> listeItems = new ArrayList<Item>();

    /**
     * @param Item item 
     * @return
     */
    public Meal addItems(Item item) {
        // TODO implement here
    	listeItems.add(item);
    	return this ;
    }
    public Meal addItems(Item item, int nb) {
        // TODO implement here
    	for (int i=0; i<nb; i++) {
    		listeItems.add(item);
    	}
    	return this ;
    }

    /**
     * @return
     */
    public void show() {
        // TODO implement here
    	for (Item item : listeItems) {
    		System.out.println("Pack : " + item.packaging().getPack() 
    						+ ", Name : " + item.getName() 
    						+ ", Price : " + item.getPrice());
    	}
    }

    /**
     * @return
     */
    public float getTotalPrice() {
        // TODO implement here
    	float prix = 0.0f;
    	for (Item item : listeItems) {
    		prix = prix + item.getPrice();
    		//System.out.println(prix);
    	}
    	return prix;
    }

}