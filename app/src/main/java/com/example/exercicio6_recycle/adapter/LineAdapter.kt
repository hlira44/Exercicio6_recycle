package com.example.exercicio6_recycle.adapter

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicio6_recycle.R
import com.example.exercicio6_recycle.dataclass.Place
import org.w3c.dom.Text
import java.util.ArrayList

class LineAdapter(private val dataSet: ArrayList<Place>) :
        RecyclerView.Adapter<LineAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val country: TextView
        val capital: TextView
        val habitantes: TextView

        init {
            country = view.findViewById(R.id.country)
            capital = view.findViewById(R.id.capital)
            habitantes = view.findViewById(R.id.habitantes)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerline, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.country.text = dataSet[position].country
        viewHolder.capital.text = dataSet[position].capital
        viewHolder.habitantes.text = dataSet[position].habitants.toString()
    }

    override fun getItemCount() = dataSet.size

}




