

public abstract class Computer {
    // Processor speed, RAM, disk, optional DVD, optional wireless, and “total price” logic

    private final double basePrice;
    private final double cpuGhz;
    private final int memoryGb;
    private final int diskGb;
    private final boolean dvd;
    private final boolean wireless;

    protected Computer(double basePrice, double cpuGhz, int memoryGb, int diskGb, boolean dvd, boolean wireless) {
        this.basePrice = basePrice;
        this.cpuGhz = cpuGhz;
        this.memoryGb = memoryGb;
        this.diskGb = diskGb;
        this.dvd = dvd;
        this.wireless = wireless;
    }

    public double cpuPrice() {
        // first 2.0 GHz included, extra charged
        double included = 2.0;
        double extraPerGhz = 120.0;
        return Math.max(0.0, cpuGhz - included) * extraPerGhz;
    }

    public double memoryPrice() {
        // first 8 GB included, extra charged
        int included = 8;
        double extraPerGb = 25.0;
        return Math.max(0, memoryGb - included) * extraPerGb;
    }

    public double diskPrice() {
        // first 256 GB included, extra charged
        int included = 256;
        double extraPerGb = 0.25;
        return Math.max(0, diskGb - included) * extraPerGb;
    }

    protected abstract double dvdPrice();           // desktop/laptop differ
    protected abstract double wirelessPrice();      // desktop/laptop differ
    protected double extraOptionsPrice() {          // laptop adds screen cost
        return 0.0;
    }

    protected abstract double shippingRate();       // desktop 10%, laptop 7%

    public final double calculateComputerPrice() {
        return basePrice
                + cpuPrice()
                + memoryPrice()
                + diskPrice()
                + (dvd ? dvdPrice() : 0.0)
                + (wireless ? wirelessPrice() : 0.0)
                + extraOptionsPrice();
    }

    public final double calculateShippingCost() {
        return calculateComputerPrice() * shippingRate();
    }

    public final double calculateTotalWithShipping() {
        return calculateComputerPrice() + calculateShippingCost();
    }

    // Getters (useful for printing invoice/config)
    public double getBasePrice() { return basePrice; }
    public double getCpuGhz() { return cpuGhz; }
    public int getMemoryGb() { return memoryGb; }
    public int getDiskGb() { return diskGb; }
    public boolean hasDvd() { return dvd; }
    public boolean hasWireless() { return wireless; }
}
