

public class PricingDemo {
    public static void main(String[] args) {
        Computer d1 = new Desktop(600.0, 2.5, 16, 512, true, true);
        Computer l1 = new Laptop(500.0, 2.5, 16, 512, true, true, 15);

        printInvoice("Desktop", d1);
        printInvoice("Laptop", l1);
    }

    public static void printInvoice(String item, Computer c) {
        System.out.println("------------ " + item + " Invoice -------------");

        System.out.println("Base price: " + c.getBasePrice());
        System.out.println("CPU Speed (GHz): " + c.getCpuGhz());
        System.out.println("RAM (GB): " + c.getMemoryGb());
        System.out.println("Storage (GB): " + c.getDiskGb());
        System.out.println("DVD: " + c.hasDvd());
        System.out.println("WiFi Enabled: " + c.hasWireless());

        System.out.println("Computer price: " + c.calculateComputerPrice());
        System.out.println("Shipping cost: " + c.calculateShippingCost());
        System.out.println("Total with shipping: " + c.calculateTotalWithShipping());

        System.out.println("--------------------------------------");
    }
}