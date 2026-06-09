package practice;

class Vehicle{

    private String brand;

    private int speed;

    public Vehicle(String brand, int speed){
        
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand(){

        return brand;
    }

    public int getSpeed(){

        return speed;
    }

    public void setSpeed(int speed){

        if(speed>=0){

            this.speed = speed;
        }
        else{

            System.out.println("Invalid speed");
        }
    }

}
class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors){

        super(brand, speed);

        this.numberOfDoors = numberOfDoors;
    }

    // Method specific to Car
    public void displayCarDetails() {

        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Doors: " + numberOfDoors);
    }
}
public class EncapsulationInheritanceExample {

    public static void main(String[] args) {
        
        Car c = new Car("BMW", 100, 4);

        c.displayCarDetails();

        c.setSpeed(120);

        System.out.println("Updated car speed is: "+c.getSpeed());
    }
}
