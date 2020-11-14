import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCoffee {

    private static List<Coffee> truck; 

    public static void main(String[] args) {
        truck = new ArrayList<>(); 
        fillTruck(truck);

        // сортировка по ценам
        Comparator<Coffee> coffeeComparator = new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                 return Integer.compare(o2.getPrice(), o1.getPrice()* 1);   
            }
            };
        
            // сортировка по типу кофе
            /*Comparator<Coffee> coffeeComparator1 = new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
            //return (o2.getType()).compareTo(o1.getType());
            if ((o2.getType() == CoffeeType.GRAIN) && (o1.getType() == CoffeeType.GROUND)) {
            return -1;
            } else if ((o1.getType() == CoffeeType.GRAIN) && (o2.getType() == CoffeeType.GROUND)) {
            return 1;
            } else if ((o1.getType() == CoffeeType.GRAIN) && (o2.getType() == CoffeeType.GROUND)) {
            return 0;
            } else {
            return 0;
            }
            }
            };*/
            
            Collections.shuffle(truck);
            for (Coffee c1 : truck) {
            System.out.println(c1);
        }
            Collections.sort(truck, coffeeComparator);
            System.out.println();
            for (Coffee cl : truck) {
            System.out.println(cl);
        }
            /*Collections.sort(truck, coffeeComparator1);
            System.out.println();
            for (Coffee cl : truck) {
            System.out.println(cl);
            }*/
           System.out.println("End"); 
           
        };

     private static void fillTruck(List<Coffee> truck) {
        truck.add(new GrainCoffee("Jacobs", "Arabica", 250, 750));
        truck.add(new GrainCoffee("Nescafe", "Robusta", 150, 600));
        truck.add(new GrainCoffee("Jardin", "Arabica", 725, 1200));
        truck.add(new GroundCoffee("Jardin", "Medium", 300, 3000));
        truck.add(new GroundCoffee("Nescafe", "Fine", 575, 5000));
        truck.add(new SolubleCoffee("Carraro", "Powder", 300, 2575));
        truck.add(new SolubleCoffee("Jacobs", "Granular", 500, 4380));
        }

    }