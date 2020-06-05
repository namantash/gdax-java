package com.coinbase.exchange.websocketfeed;

/**
 * <pre>
 *  {
 *    "type": "open",
 *    "time": "2014-11-07T08:19:27.028459Z",
 *    "product_id": "BTC-USD",
 *    "sequence": 10,
 *    "order_id": "d50ec984-77a8-460a-b958-66f114b0de9b",
 *    "price": "200.2",
 *    "remaining_size": "1.00",
 *    "side": "sell"
 *  }
 * </pre>
 */
public class OpenedOrderBookMessage extends OrderBookMessage {

    public OpenedOrderBookMessage() {
        setType("open");
    }
}
