public class Variable {
    public static void main(String[] args) {
        byte numberOfCpuCores = 2;
        short numberOfRamSlots = 4;
        int architectureOfCpu = 64;
        long capacityOfHdd = 1000L;
        float speedOfCpu = 2.9f;
        double hardDriveRpm = 5400.0d;
        char brandOfCpu = 'I';
        boolean haveInstalledOS = false;

        System.out.println("Number of processor cores: " + numberOfCpuCores);
        System.out.println("Number of memory slots: " + numberOfRamSlots);
        System.out.println("Processor architecture: " + architectureOfCpu + "-bit");
        System.out.println("Capacity of hard drive: " + capacityOfHdd + "Gb");
        System.out.println("Processor speed: " + speedOfCpu + "GHz");
        System.out.println("Hard drive RPM: " + hardDriveRpm);
        System.out.println("Processor brand: " + brandOfCpu);
        System.out.println("Installed OS: " + haveInstalledOS);
    }
}
