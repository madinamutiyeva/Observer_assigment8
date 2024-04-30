package Observer_Pattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Investor {
    private String name;
    private List<Stock> stocks = new ArrayList<Stock>();

    public Investor(String name) {
        this.name = name;
    }

    public void update(Stock stock, float price) {
        System.out.println("Notified " + getName() + " of " + stock.getSymbol() +
                " Price Changed to: " + price);
    }

    public void addStock(Stock stock) {
        if (!stocks.contains(stock)) {
            stocks.add(stock);
            stock.registerInvestor(this);
        }
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
        stock.unregisterInvestor(this);
    }
}
