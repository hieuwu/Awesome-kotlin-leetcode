class BestTimeToBuySellStock {
    companion object {
        fun maxProfit(prices: IntArray): Int {
            var max = 0
            for(i in 0..prices.size-2) {
                for(j in i+1..prices.size-1) {
                    if (prices[i] - prices[j] < 0) {
                        if ( Math.abs(prices[i] - prices[j] )>= max) {
                            max = Math.abs(prices[i] - prices[j] )
                        }
                    }
                }
            }
            return max
        }
    }
}