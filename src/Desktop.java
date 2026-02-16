

public class Desktop extends Computer {

    public Desktop(double basePrice, double cpuGhz, int memoryGb, int diskGb, boolean dvd, boolean wireless) {
        super(basePrice, cpuGhz, memoryGb, diskGb, dvd, wireless);
    }

    @Override
    protected double dvdPrice() {
        return 70.0;
    }

    @Override
    protected double wirelessPrice() {
        return 45.0;
    }

    @Override
    protected double shippingRate() {
        return 0.10; // 10%
    }
}
