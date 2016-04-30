package omegadeveloper.entity;
public class Underlying {

    String name;
    String exchange;
    Double marketPrice;
    String marketPriceCurrency;

    public Underlying(String name, String exchange, Double marketPrice, String marketPriceCurrency) {
        this.name = name;
        this.exchange = exchange;
        this.marketPrice = marketPrice;
        this.marketPriceCurrency = marketPriceCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
}
