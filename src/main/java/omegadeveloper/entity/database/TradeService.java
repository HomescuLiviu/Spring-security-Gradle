package omegadeveloper.entity.database;


import omegadeveloper.entity.Trade;

import java.util.List;

public interface TradeService {

    Trade getTradeByName();

    void addTrade(Trade trade);

    void addTrades(List<Trade> tradeList);

    List<Trade> getListOfTrades();

}
