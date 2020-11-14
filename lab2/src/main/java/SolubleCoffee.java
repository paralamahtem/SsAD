public class SolubleCoffee extends Coffee {
    private String form;
    private CoffeeType type;

    public SolubleCoffee(String brand, String form, int mass, int price) {
        this.form= form;
        this.type = CoffeeType.SOLUBLE;
        super.setBrand(brand);
        super.setMass(mass);
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "SolubleCoffee { " +
                "mass=" + super.getMass() +
                ", price=" + super.getPrice() +
                ", form=" + form +
                ", type=" + type +
                " }";
    }

}