package composition;

public class Computer {
    private Processor processor;
    private Ram ram;

    public Computer(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public void run() {
        System.out.println("running");
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}


class Processor {
    String name;
    int numberOfCores;

    public Processor(String name, int numberOfCores) {
        this.name = name;
        this.numberOfCores = numberOfCores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}

class Ram {
    String name;
    int size;

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}