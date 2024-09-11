package com.rizki.mobile_app_kotlin2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobile_app_kotlin2c.R
import com.rizki.mobile_app_kotlin2c.model.ModelBuah

class BuahAdapter (val itemList: ArrayList<ModelBuah>):
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        //deklarasi widget dari layout item
        var itemImage : ImageView
        var itemNama : TextView
        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //manggil layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
       return  itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
    }

}