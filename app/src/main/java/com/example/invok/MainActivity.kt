package com.example.invok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.invok.Adepter.ItemAdepter
import com.example.invok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
 var name= arrayOf("c","c++","java","kotlin","php","html")
    lateinit var adepter: ItemAdepter


    override fun onCreate(savedInstanceState: Bundle?) {
        var binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



  adepter=ItemAdepter{n->

      binding.txt.text= n


  }
        adepter.addNames(name)
        binding.revitem.layoutManager=LinearLayoutManager(this)
        binding.revitem.adapter=adepter



    }
}