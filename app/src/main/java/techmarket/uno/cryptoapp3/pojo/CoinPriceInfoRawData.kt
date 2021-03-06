package techmarket.uno.cryptoapp3.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CoinPriceInfoRawData (

    @SerializedName("RAW")
    @Expose
    private val coinPriceInfoJsonObject: JsonObject? = null
)