public class SimpleCheeseCornPizzaMaker extends PizzaMaker {

    @Override
    public void selectBread() {
        System.out.println("Selecting Bread...");
    }

    @Override
    public void chooseIngredients() {
        System.out.println("Selecting ingredients...");
    }

    @Override
    public void bakeAtTemp() {
        System.out.println("Baking at temp...");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Toppings...");
    }

    @Override
    public void addCheese() {
        System.out.println("Adding Cheese...");
    }
}
