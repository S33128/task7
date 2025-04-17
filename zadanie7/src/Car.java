public class Car extends Vehicle {
    private int numberOfSeats;
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void start() {
        System.out.println("Car1 started");
    }
    public void stop(){
        System.out.println("Car1 stopped");
    }
}
