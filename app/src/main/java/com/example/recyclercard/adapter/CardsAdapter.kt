package com.example.recyclercard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclercard.databinding.ActivityMainBinding
import com.example.recyclercard.databinding.CardBinding
import com.example.recyclercard.model.Cards

class CardsAdapter(
    private val context: Context,
    private var cards: List<Cards>):RecyclerView.Adapter<CardsAdapter.CardsViewHolder>() {







    // data binding, using layout in the cards.xml file gave us the CardBinding class
    //to map out to out viewholder
    inner class CardsViewHolder (var binding: CardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {

        val binding = CardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        // the funtion expects a CardViewHolder object, we pass it along the binding object
        return CardsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) {
        val dataset= cards[position]
        //Access the card.xml elements with id´s and assign them values based on
        //their position on the List
        // both itemTitle and itemImage are views in the card.xml

        holder.binding.itemTitle.text= context.resources.getString(dataset.stringResourceId)
        holder.binding.itemImage.setImageResource(dataset.imageResourceId)
    }

    override fun getItemCount(): Int {

       return cards.size
        //well.. this one is a no brainer... moving on then
    }


}