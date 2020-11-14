public class GroundCoffee extends Coffee {
    private String grinding;
    private CoffeeType type;

    public GroundCoffee(String brand, String grinding, int mass, int price) {
        this.grinding = grinding;
        this.type = CoffeeType.GROUND;
        super.setBrand(brand);
        super.setMass(mass);
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "GroundCoffee { " +
                "mass=" + super.getMass() +
                ", price=" + super.getPrice() +
                ", grinding=" + grinding +
                ", type=" + type +
                " }";
    }

}
