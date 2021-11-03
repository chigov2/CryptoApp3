package techmarket.uno.cryptoapp3.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query
import techmarket.uno.cryptoapp3.pojo.CoinInfoListOfData
import techmarket.uno.cryptoapp3.pojo.CoinPriceInfoRawData

interface ApiService {
    //получить список самых популярных валют
    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "efce2b5ca89708d75ff4a568716dfaf2d7acce12260f1f60d2d5232dd72401b9",
        @Query(QUERY_PARAM_LIMIT) limit:Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym:String = CURRENCY
        ): Single<CoinInfoListOfData>

    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "efce2b5ca89708d75ff4a568716dfaf2d7acce12260f1f60d2d5232dd72401b9",
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms:String,
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms:String = CURRENCY
    ): Single<CoinPriceInfoRawData>

    companion object{
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val CURRENCY = "USD"

    }
}