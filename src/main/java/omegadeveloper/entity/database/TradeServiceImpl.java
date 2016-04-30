package omegadeveloper.entity.database;


import omegadeveloper.entity.Trade;
import omegadeveloper.entity.Underlying;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TradeServiceImpl implements TradeService {

    static Map<String, Trade> store = new ConcurrentHashMap<>();
    static final ExecutorService executorService = Executors.newFixedThreadPool(1000);

    static {
        Underlying testUnderlying_1 = new Underlying("underlying_1", "HKG", 10.2, "USD");



        store.put("sss", new Trade("sss", "seller_1", "buyer_1", 30.2, "USD", LocalDate.of(2016, 5, 1), testUnderlying_1));


    }


    @Override
    public Trade getTradeByName() {
        return null;
    }

    @Override
    public void addTrade(Trade trade) {
        store.put(generateID(), trade);
    }

    private String generateID() {
         return "";
    }

    @Override
    public void addTrades(List<Trade> tradeList) {
        tradeList.stream()
                .forEach((t) -> executorService.submit( () -> addTrade(t) ));
    }

    @Override
    public List<Trade> getListOfTrades() {
        return new ArrayList<>(store.values());
    }
}
