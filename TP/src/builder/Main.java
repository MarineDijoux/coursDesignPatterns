package builder;

public class Main {

    public static void main(String[] args) {
        // TODO implement here
    	
    	Meal meal = new Meal();
    	meal.addItems(new Coke());
    	meal.show();
    	System.out.println("Cout : " + meal.getTotalPrice());
    	
    	meal = new Meal();
    	meal.addItems(new Pepsi())
    		.addItems(new ChickenBurger(), 2)
    		.addItems(new VegBurger());
    	meal.show();
    	System.out.println("Cout : " + meal.getTotalPrice());
    	
    	MealBuilder mealBuilder = new MealBuilder();
    	
    	System.out.println("VEG");
    	Meal vegMeal = mealBuilder.prepareVegMeal();
    	vegMeal.show();
    	System.out.println("Cout : " + vegMeal.getTotalPrice());
    	
    	System.out.println("NON VEG");
    	Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    	nonVegMeal.show();
    	System.out.println("Cout : " + nonVegMeal.getTotalPrice());
    	nonVegMeal.addItems(new Coke(), 2)
    			.addItems(new GirlGame());
    	nonVegMeal.show();
    	System.out.println("Cout : " + nonVegMeal.getTotalPrice());

    }

}