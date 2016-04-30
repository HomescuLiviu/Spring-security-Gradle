package omegadeveloper.entity;

import java.time.LocalDate;

public class Trade {

    String name;
    Account seller;
    Account buyer;
    Double price;
    String currency;
    LocalDate time;
    Underlying underlying;

    public Trade(String name, String seller, String buyer, Double price, String currency, LocalDate time, Underlying underlying) {
        this.name = name;
        this.seller = new Account(seller);
        this.buyer = new Account(buyer);
        this.price = price;
        this.currency = currency;
        this.time = time;
        this.underlying = underlying;
    }

    public Account getBuyer() {
        return buyer;
    }

    public Account getSeller() {
        return seller;
    }

    public String getName() {
        return name;
    }

}
