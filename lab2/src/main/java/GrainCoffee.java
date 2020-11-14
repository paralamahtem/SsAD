public class GrainCoffee extends Coffee {
   private String variety;
    private CoffeeType type;

    public GrainCoffee(String brand,String variety, int mass, int price) {
        this.variety = variety;
        this.type = CoffeeType.GRAIN;
        super.setBrand(brand);
        super.setMass(mass);
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "GrainCoffee { " +
                "mass=" + super.getMass() +
                ", price=" + super.getPrice() +
                ", variety=" + variety +
                ", type=" + type +
                " }";
    }
}
