package oops.inheritance;

public class ClassDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("porsche");
        car.setModel("Carrera");
        car.setDoor(2);
        car.setColor("blue");
        car.setConvertible(true);
        car.describeCar();

    }
}
