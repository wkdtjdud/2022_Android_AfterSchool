package com.example.todayquote

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

class QuoteEditAdapter (val dataList: List<quote>)
    : RecyclerView.Adapter<QuoteEditAdapter.QuoteItemViewHolder> ()
{
        class QuoteItemViewHolder(val view: View) : RecyclerView.ViewHolder(view){

        }

}