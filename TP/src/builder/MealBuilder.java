package builder ;

public class MealBuilder {

    /**
     * @return
     */
    public Meal prepareVegMeal() {
        // TODO implement here
        Meal meal = new Meal();
        meal.addItems(new VegBurger())
			.addItems(new Pepsi());
        return meal;
    }

    /**
     * @return
     */
    public Meal prepareNonVegMeal() {
        // TODO implement here
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger())
        	.addItems(new Coke());
        return meal;
    }
	
}