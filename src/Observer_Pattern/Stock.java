package Observer_Pattern;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Stock {
    private String symbol;
    private float price;
    private List<Investor> investors = new ArrayList<Investor>();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void registerInvestor(Investor investor) {
        if (!investors.contains(investor)) {
            investors.add(investor);
        }
    }

    public void unregisterInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void updatePrice(float price) {
        this.price = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(this, price);
        }
    }
}
