public class PizzaVegetable extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizaa Cheese Prepare");
    }

    @Override
    public void sauce() {
        System.out.println("Pizaa Cheese Prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pizaa Cheese Bake");
    }

    @Override
    public void cut() {
        System.out.println("Pizaa Cheese Cut");
    }

    @Override
    public void box() {
        System.out.println("Pizaa Cheese Box");
    }
}
