package com.example.recyclercard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclercard.adapter.CardsAdapter
import com.example.recyclercard.data.DataCards
import com.example.recyclercard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var cardsList= DataCards().getCards()

        //this is context, this activity is the context
        val adapter= CardsAdapter(this,cardsList)
        binding.recyclerView.adapter=adapter

        binding.recyclerView.layoutManager= LinearLayoutManager(this)
    }
}