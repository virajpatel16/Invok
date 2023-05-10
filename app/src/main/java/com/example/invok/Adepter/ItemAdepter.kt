package com.example.invok.Adepter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.invok.databinding.ItemViewBinding

class ItemAdepter(click: (String) -> Unit) : RecyclerView.Adapter<ItemAdepter.Itemhodel>() {
     var click=click
     lateinit var name:Array<String>


    class Itemhodel(itemView: ItemViewBinding) : ViewHolder(itemView.root){
  var binding=itemView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Itemhodel {
       var binding= ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Itemhodel(binding)
    }

    override fun getItemCount(): Int {
return name.size
    }

    override fun onBindViewHolder(holder: Itemhodel, position: Int) {
       holder.binding.apply {
           textview.text=name.get(position)
       }
        holder.itemView.setOnClickListener {
            click.invoke(name.get(position))
        }
    }

    fun addNames(name: Array<String>) {
        this.name=name


    }

}