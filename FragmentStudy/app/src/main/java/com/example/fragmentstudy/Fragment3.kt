package com.example.fragmentstudy


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import java.lang.Exception
import java.time.temporal.TemporalAmount
import java.util.*


class Fragment3: Fragment() {
    interface CurrencyCalculationListerner{
        fun onCalculate(result:Double,
                        amount: Double,
                        from: String,
                        to:String
        )
    }
    lateinit var listener: CurrencyCalculationListerner

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(activity is CurrencyCalculationListerner) {
            listener = activity as CurrencyCalculationListerner

        }else{
            throw Exception("CurrencyCalculationListener 미구현")

        }


    }

    val currencyExchangeMap = mapOf( //주생성자는 만들지 말기!
        "USD" to 1.0,
        "EUR" to 0.9,
        "JPY" to 110.0,
        "KRW" to 1150.0
    )

    fun calculateCurrency(amount: Double, from: String, to:String): Double{
        //from에 USD를 적고 to에 EUR을 적을 시 USD를 EUR로 변환
        var USDAmount = if(from != "USD"){
            (amount/currencyExchangeMap[from]!!)
        }else{
            amount
        }
        return currencyExchangeMap[to]!!*USDAmount
    }

    lateinit var fromCurrency:String
    lateinit var toCurrency:String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(
            R.layout.currency_converter_fragment2,
            container,
            false
        )

        val calculateBtn = view.findViewById<Button>(R.id.calculate)
        val amount = view.findViewById<EditText>(R.id.amount)
        val exchangeType = view.findViewById<TextView>(R.id.exchange_type)

        fromCurrency = arguments?.getString("from", "USD")!!
        toCurrency = arguments?.getString("to", "USD")!!

        exchangeType.text = "${fromCurrency} => ${toCurrency} 변환"

         calculateBtn.setOnClickListener {
             val result = calculateCurrency(
                 amount.text.toString().toDouble(),
                 fromCurrency,
                 toCurrency
             )
             //TODO:result값을 액티비티로 전달
             listener.onCalculate(
                 result,
                 amount.text.toString().toDouble(),
                 fromCurrency, toCurrency
             )
         }

        return view
    }
    companion object{
        fun newInstance(from:String, to:String):Fragment3{
            val fragment = Fragment3()

            //번들 객체를 만들고 필요한 데이터 저장
            val args = Bundle()
            args.putString("from", from)
            args.putString("to", to)
            fragment.arguments = args
            return fragment
        }
    }
}