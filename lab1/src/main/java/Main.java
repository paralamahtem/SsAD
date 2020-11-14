public class Main {
    public static void main(String[] args){
        Airline[] airplane = new Airline[5];
        airplane[0] = new Airline("Paris",234,"passenger",20.05,"Monday");
        airplane[1] = new Airline("Kiev",120,"passenger",15.23,"Monday");
        airplane[2] = new Airline("London",35,"passenger",10.15,"Thursday");
        airplane[3] = new Airline("Madrid",87,"passenger",17.48,"Wednesday");
        airplane[4] = new Airline("Rome",105,"passenger",13.35,"Saturday");
    
    System.out.println("A");
    for (int i = 0; i <5; i++){
        if ("Paris".equals(airplane[i].destination)) {
            System.out.println("Flight number is " + airplane[i].flightNum + ", departure time:" + airplane[i].departureTime);
            }
        }
    System.out.println("End \n");
    
    System.out.println("B");
    for (int i = 0; i < 5; i++){
        if ("Thursday".equals(airplane[i].weekday)){
            System.out.println("Destination is " + airplane[i].destination + ", flight number is " + airplane[i].flightNum + ", departure time:" + airplane[i].departureTime);
            }
        }
    System.out.println("End \n");
    
    System.out.println("C");
    for (int i = 0; i <5; i++){
        if ("Monday".equals(airplane[i].weekday) && airplane[i].departureTime > 14.25 ) {
            System.out.println("Destination is " + airplane[i].destination + ", flight number is " + airplane[i].flightNum + ", departure time:" + airplane[i].departureTime);
            }
        }
    System.out.println("End \n");
    }
}