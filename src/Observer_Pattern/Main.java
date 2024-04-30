package Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        Stock apple = new Stock("AAPL", 150.0f);
        Stock google = new Stock("GOOGL", 120.0f);

        Investor investor1 = new Investor("inv1");
        Investor investor2 = new Investor("inv2");

        apple.registerInvestor(investor1);
        apple.registerInvestor(investor2);

        google.registerInvestor(investor1);

        System.out.println("Updating Apple price to 152.0");
        apple.updatePrice(152.0f);

        System.out.println("Updating Google price to 125.0");
        google.updatePrice(125.0f);

        System.out.println("Unregistering inv1 from Apple stock.");
        apple.unregisterInvestor(investor2);

        System.out.println("Updating Apple  price to 155.0");
        apple.updatePrice(155.0f);
    }
}
