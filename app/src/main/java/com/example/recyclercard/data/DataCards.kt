package com.example.recyclercard.data

import com.example.recyclercard.R
import com.example.recyclercard.model.Cards

class DataCards {
// so... aparently you can get strings as integer if you getthem out of the
    // values/string file like so ?
    fun getCards() : List<Cards>{
        return mutableListOf<Cards>(
            Cards(R.string.card1, R.drawable.image1),
            Cards(R.string.card2, R.drawable.image2),
            Cards(R.string.card3, R.drawable.image3),
            Cards(R.string.card4, R.drawable.image4),
            Cards(R.string.card5, R.drawable.image5),
            Cards(R.string.card6, R.drawable.image6),
            Cards(R.string.card7, R.drawable.image7),
            Cards(R.string.card8, R.drawable.image8),
            Cards(R.string.card9, R.drawable.image9),
            Cards(R.string.card10, R.drawable.image10),
            Cards(R.string.card1, R.drawable.image1),
        )
    }
}