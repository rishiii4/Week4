package personalizedmealplan;

public class VeganMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VeganMeal(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    // Method to get meal name
    @Override
    public String getMealName() { return mealName; }

    // Method to get calories
    @Override
    public int getCalories() { return calories; }

    @Override
    public String toString() { return mealName + " - " + calories + " kcal"; }
}
