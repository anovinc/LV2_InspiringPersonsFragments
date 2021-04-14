package com.example.inspiringpersonsfragments

import androidx.recyclerview.widget.RecyclerView
import com.example.inspiringpersonsfragments.databinding.ItemInspiringPersonBinding
import com.squareup.picasso.Picasso


class InspiringPersonViewHolder(private val itemInspiringPersonBinding: ItemInspiringPersonBinding) : RecyclerView.ViewHolder(itemInspiringPersonBinding.root) {

    fun bind(inspiringPerson: InspiringPerson){
        itemInspiringPersonBinding.tvDetailsInspiringPerson.text=inspiringPerson.details
        itemInspiringPersonBinding.tvNameInspiringPerson.text=inspiringPerson.name
        itemInspiringPersonBinding.tvLifetimeInspiringPerson.text=inspiringPerson.lifetime

        Picasso.get()
            .load(inspiringPerson.picture)
            .fit()
            .into(itemInspiringPersonBinding.ivInspiringPerson)

    }
}