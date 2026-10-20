package oops.inheritance.classDemo;

public class HouseDemo {
    public static void main(String[] args) {
        House blue = new House("blue");
        House anotherHouse = blue;
        System.out.println(blue.getColor());
        System.out.println(anotherHouse.getColor());

        House yellow = new House("yellow");
        anotherHouse = yellow;
        System.out.println(yellow.getColor());
        System.out.println(anotherHouse.getColor());

        House green = new House("green");
        anotherHouse = green;
        System.out.println(blue.getColor());
        System.out.println(green.getColor());
        System.out.println(anotherHouse.getColor());
        new House("pink");
    }
}
