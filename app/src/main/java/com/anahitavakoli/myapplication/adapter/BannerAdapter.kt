package com.anahitavakoli.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.anahitavakoli.myapplication.R
import com.anahitavakoli.myapplication.model.Banner
import com.squareup.picasso.Picasso


class BannerAdapter(context : Context, data : List<Banner>) : RecyclerView.Adapter<BannerAdapter.BannerVH>() {

    var context = context
    var listBanner = data
    var inflater :LayoutInflater = LayoutInflater.from(context)


    class BannerVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgBanner = itemView.findViewById<AppCompatImageView>(R.id.img_banner)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerVH {
        var view = inflater.inflate(R.layout.banner_home_raw,null)
        return BannerVH(view)
    }

    override fun onBindViewHolder(holder: BannerVH, position: Int) {
        val banner:Banner = listBanner.get(position)
        Picasso.get().load(banner.bannerImage).into(holder.imgBanner)

    }

    override fun getItemCount(): Int {
        return listBanner.size
    }

}