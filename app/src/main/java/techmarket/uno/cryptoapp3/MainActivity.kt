package techmarket.uno.cryptoapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.Schedulers.io
import techmarket.uno.cryptoapp3.api.ApiFactory

class MainActivity : AppCompatActivity() {

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val disposable = ApiFactory.apiService.getTopCoinsInfo()
        //val disposable = ApiFactory.apiService.getFullPriceList(fSyms = "BTC,ETH")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("data_testing",it.toString())
            },{
                Log.d("data_testing", it.message.toString())//it.message.toString()
            })
        //val test = ApiFactory.apiService.test()


        compositeDisposable.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}