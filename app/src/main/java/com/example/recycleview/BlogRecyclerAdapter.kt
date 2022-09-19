package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.models.BlogPost


class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<BlogPost> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item,parent,false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return items.size
    }



    class BlogViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val blogImage = itemView.findViewById<ImageView>(R.id.blog_image)
        val blogImage = itemView.findViewById<ImageView>(R.id.blog_image)
        val blogImage = itemView.findViewById<ImageView>(R.id.blog_image)
    }


}