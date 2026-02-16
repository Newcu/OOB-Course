

public class Laptop extends Computer {
    private final int screenSizeInch;

    public Laptop(double basePrice, double cpuGhz, int memoryGb, int diskGb,
                  boolean dvd, boolean wireless, int screenSizeInch) {
        super(basePrice, cpuGhz, memoryGb, diskGb, dvd, wireless);
        this.screenSizeInch = screenSizeInch;
    }

    @Override
    protected double dvdPrice() {
        return 100.0;
    }

    @Override
    protected double wirelessPrice() {
        return 30.0;
    }

    @Override
    protected double extraOptionsPrice() {
        int baseScreen = 13;
        int extraInches = Math.max(0, screenSizeInch - baseScreen);
        return extraInches * 50.0;
    }

    @Override
    protected double shippingRate() {
        return 0.07; // 7%
    }

    public int getScreenSizeInch() {
        return screenSizeInch;
    }
}
