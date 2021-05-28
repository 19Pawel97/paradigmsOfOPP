package composition;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer(new Processor("processor",4), new Ram("ram",16));

        System.out.println(computer.getProcessor().getName());
        System.out.println(computer.getRam().getName());

    }

}
