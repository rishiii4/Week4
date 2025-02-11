package personalizedmealplan;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    // List to store meal items
    private List<T> meals = new ArrayList<>();

    // Method to add a meal
    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }

    // Method to display all meals in the meal plan
    public void displayMeals() {
        System.out.println("Meal Plan:");
        for (T meal : meals) {
            System.out.println(meal);
        }
    }
}
