package techmarket.uno.cryptoapp3.pojo

import android.media.Rating
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CoinInfo {
    @SerializedName("Id")
    @Expose
    private val id: String? = null

    @SerializedName("Name")
    @Expose
    private val name: String? = null

    @SerializedName("FullName")
    @Expose
    private val fullName: String? = null

    @SerializedName("Internal")
    @Expose
    private val internal: String? = null

    @SerializedName("ImageUrl")
    @Expose
    private val imageUrl: String? = null

    @SerializedName("Url")
    @Expose
    private val url: String? = null

    @SerializedName("Algorithm")
    @Expose
    private val algorithm: String? = null

    @SerializedName("ProofType")
    @Expose
    private val proofType: String? = null

    @SerializedName("Rating")
    @Expose
    private val rating: Rating? = null

    @SerializedName("NetHashesPerSecond")
    @Expose
    private val netHashesPerSecond: Int? = null

    @SerializedName("BlockNumber")
    @Expose
    private val blockNumber: Int? = null

    @SerializedName("BlockTime")
    @Expose
    private val blockTime: Int? = null

    @SerializedName("BlockReward")
    @Expose
    private val blockReward: Int? = null

    @SerializedName("AssetLaunchDate")
    @Expose
    private val assetLaunchDate: String? = null

    @SerializedName("MaxSupply")
    @Expose
    private val maxSupply: Int? = null

    @SerializedName("Type")
    @Expose
    private val type: Int? = null
}