// Car.java
public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;

    // Constructor
    public Car(String make, String model, int year, String color, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    // Getter and Setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println(this); // Calls the toString method
    }

    // Method to simulate driving the car and increasing the mileage
    public void drive(double miles) {
        if (miles > 0) {
            mileage += miles;
            System.out.println("You drove " + miles + " miles.");
        } else {
            System.out.println("Miles driven must be positive.");
        }
    }

    // Method to simulate servicing the car (resets mileage)
    public void serviceCar() {
        System.out.println("Car has been serviced. Mileage reset.");
        mileage = 0;
    }

    // Method to compare the mileage of this car with another car
    public void compareMileage(Car otherCar) {
        if (this.mileage > otherCar.mileage) {
            System.out.println(this.model + " has more mileage than " + otherCar.model);
        } else if (this.mileage < otherCar.mileage) {
            System.out.println(this.model + " has less mileage than " + otherCar.model);
        } else {
            System.out.println(this.model + " and " + otherCar.model + " have the same mileage.");
        }
    }

    // Overridden toString method to provide a nice string representation of the car
    @Override
    public String toString() {
        return "Car Details:\n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Color: " + color + "\n" +
                "Mileage: " + mileage + " miles";
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create two Car objects
        Car myCar = new Car("Toyota", "Corolla", 2020, "Blue", 15000);
        Car anotherCar = new Car("Honda", "Civic", 2021, "Red", 12000);

        // Display car details
        myCar.displayCarDetails();
        anotherCar.displayCarDetails();

        // Simulate driving the car
        myCar.drive(100);

        // Display updated car details
        myCar.displayCarDetails();

        // Service the car and reset mileage
        myCar.serviceCar();

        // Display updated car details after service
        myCar.displayCarDetails();

        // Compare mileage of two cars
        myCar.compareMileage(anotherCar);
    }
}
