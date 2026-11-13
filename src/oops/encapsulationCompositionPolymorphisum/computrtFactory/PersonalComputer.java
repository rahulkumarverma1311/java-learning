package oops.encapsulationCompositionPolymorphisum.computrtFactory;

public class PersonalComputer extends Product{

    private Motherboard motherboard;
    private Monitor monitor;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, Monitor monitor, ComputerCase computerCase) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }
}
