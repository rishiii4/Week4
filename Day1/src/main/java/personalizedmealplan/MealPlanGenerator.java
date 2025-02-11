package personalizedmealplan;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Vegetarian Meal Plan
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        vegetarianMealPlan.addMeal(new VegetarianMeal("Paneer Curry", 400));
        vegetarianMealPlan.addMeal(new VegetarianMeal("Vegetable Salad", 200));
        vegetarianMealPlan.addMeal(new VegetarianMeal("Dal & Rice", 500));

        // Vegan Meal Plan
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(new VeganMeal("Tofu Stir Fry", 350));
        veganMealPlan.addMeal(new VeganMeal("Vegan Burger", 450));
        veganMealPlan.addMeal(new VeganMeal("Quinoa Salad", 300));

        // Display meal plans
        vegetarianMealPlan.displayMeals();
        veganMealPlan.displayMeals();
    }
}
