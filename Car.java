package JavaProjects2;

public class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.90;
        } else {
            return carPrice * 0.80;

        }

    }
}

class Sedan extends Car {

    private double length;


    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.90;
        }
    }
}

class CarTester {
    public static void main(String[] args) {

        Truck truck = new Truck(40.000, "Grey", 200);
        Sedan sedan = new Sedan(30.000, "White", 15);
        System.out.println("Truck price is: "+truck.calculateSalePrice());
        System.out.println("Sedan price is: "+sedan.calculateSalePrice());


    }
}