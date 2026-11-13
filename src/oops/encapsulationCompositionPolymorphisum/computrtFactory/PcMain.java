package oops.encapsulationCompositionPolymorphisum.computrtFactory;

public class PcMain {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208","dell","240");
        Monitor monitor = new Monitor("27-inch beat","acer",27,"2540 x 1440");
        Motherboard motherboard = new Motherboard("bj-200","asus",4,6,"v2.44");
        PersonalComputer personalComputer = new PersonalComputer("2208","dell",motherboard,monitor,computerCase);


        personalComputer.getMonitor().drawPixelAt(10,10,"red");
        personalComputer.getMotherboard().loadProgram("windows os");
        personalComputer.getComputerCase().pressPowerButton();
    }
}
