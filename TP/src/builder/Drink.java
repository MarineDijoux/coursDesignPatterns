package builder;

public abstract class Drink implements Item {

    /**
     * @return
     */
    public Packaging packaging() {
        // TODO implement here
    	return new Bottle();
    }

}