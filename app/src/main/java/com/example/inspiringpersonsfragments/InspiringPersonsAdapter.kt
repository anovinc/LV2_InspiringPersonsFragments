package com.example.inspiringpersonsfragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.inspiringpersonsfragments.databinding.ItemInspiringPersonBinding

class InspiringPersonsAdapter : RecyclerView.Adapter<InspiringPersonViewHolder>() {
    private val inspiringPersons: MutableList<InspiringPerson> = mutableListOf()

    init {
            update(inspiringPersons)
    }

     fun update(inspiringPersons: List<InspiringPerson>) {
            this.inspiringPersons.clear()
            this.inspiringPersons.addAll(inspiringPersons)
            this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InspiringPersonViewHolder {
            val layoutInflater=LayoutInflater.from(parent.context)
            val itemInspiringPersonBinding=ItemInspiringPersonBinding.inflate(layoutInflater,parent,false)
            return InspiringPersonViewHolder(itemInspiringPersonBinding)
        }

    override fun onBindViewHolder(holder: InspiringPersonViewHolder, position: Int) {
            val person=inspiringPersons[position]
            holder.bind(person)
    }

    override fun getItemCount()=inspiringPersons.size
}