package com.example.todayquote

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuoteAdapter(val dataList: List<Quote>):
    RecyclerView.Adapter<QuoteAdapter.QuoteItemViewHolder>()
{
    class QuoteItemViewHolder(val view: View):
            RecyclerView.ViewHolder(view){

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: QuoteItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

override fun getItemViewType(position: Int):Int{
    return R.layout.quote_list_item
    }
}
        override fun onBindViewHolder(holder: QuoteAdapter.QuoteItemViewHolder, position: Int){
            TODO("Not")
        }

overrid fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Quote)
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
            return QuoteItemView


        fun (q: Quote){
            this.quote = q
            quoteText.text = quote.text
            quoteFrom.text = quote.from
        }

    val pref = getSharePreferences("quotes", Context.MODE_PRIVATE)
    val