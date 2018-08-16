package builder ;

public class VegBurger extends Burger {

    private String VEG = "Veg Burger";
    private float price = 8.50f;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return this.VEG;
    }

    /**
     * @return
     */
    public float getPrice() {
        // TODO implement here
        return this.price;
    }

}