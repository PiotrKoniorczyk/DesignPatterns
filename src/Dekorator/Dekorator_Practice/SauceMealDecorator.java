package Dekorator.Dekorator_Practice;

public class SauceMealDecorator extends MealDecorator {


    public SauceMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSouce();
    }

    private void addSouce() {
        System.out.println("Do dania dodaję sos.");
    }
}
