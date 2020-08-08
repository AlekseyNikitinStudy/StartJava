public class Variable {
    public static void main (String[] args){
        byte numberOfProcessorCores = 2;
        short numberOfMemorySlots = 4;
        int processorArchitecture = 64;
        long capacityOfHardDrive = 1000L;
        float processorSpeed = 2.9f;
        double hardDriveRPM = 5400.0d;
        char processorBrand = 'I';
        boolean haveInstalledOS = false;

        System.out.println("Number of processor cores: " + numberOfProcessorCores);
        System.out.println("Number of memory slots: " + numberOfMemorySlots);
        System.out.println("Processor architecture: " + processorArchitecture + "-bit");
        System.out.println("Capacity of hard drive: " + capacityOfHardDrive + "Gb");
        System.out.println("Processor speed: " + processorSpeed + "GHz");
        System.out.println("Hard drive RPM: " + hardDriveRPM);
        System.out.println("Processor brand: " + processorBrand);
        System.out.println("Installed OS: " + haveInstalledOS);
    }
}
