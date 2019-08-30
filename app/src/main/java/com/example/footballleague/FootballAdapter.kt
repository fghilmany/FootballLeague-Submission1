package com.example.footballleague

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.footballleague.ui.ItemUI
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext

class FootballAdapter(private val items:List<Item>, private val listener: (Item) -> Unit)
    : RecyclerView.Adapter<FootballAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
        ViewHolder(ItemUI().createView(AnkoContext.Companion.create(parent.context, parent)))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position],listener)
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

        private val name = itemView.findViewById<TextView>(ItemUI.club_name)
        private val image = itemView.findViewById<ImageView>(ItemUI.club_image)


        fun bindItem(items: Item, listener: (Item) -> Unit){
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(image) }
            itemView.setOnClickListener {
                listener(items)
            }
        }

    }
}