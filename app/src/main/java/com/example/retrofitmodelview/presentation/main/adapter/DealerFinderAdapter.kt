package com.example.retrofitmodelview.presentation.main.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitmodelview.R
import com.example.retrofitmodelview.databinding.SingleDealerBinding
import com.example.retrofitmodelview.data.model.Event
class DealerFinderAdapter(private val context: Context) :
    RecyclerView.Adapter<DealerFinderAdapter.ViewHolder>() {
    private var eList: MutableList<Event?> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SingleDealerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return eList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = eList[position]
        if (item != null) {
            with(holder) {
                binding.progress.visibility=View.GONE
                binding.tvTitle.text = item.title
                binding.tvTimeZone.text =
                    context.getString(R.string.timezone) + " ${item.timezone.toString()}"
                binding.tvStartDate.text = item.startDate
                val imageUrl = item.image?.url
                Glide.with(holder.itemView)
                    .load(imageUrl)
                    .error(R.drawable.ic_launcher_background)
                    .into(binding.ivImage)
                binding.tvEndDate.text = item.endDate
                binding.ivImage.setOnClickListener {
                if (item.image?.url !=null && item.image?.url!!.isNotEmpty()) {
                    val uri = Uri.parse(item.image?.url)
                    val launchBrowser = Intent(Intent.ACTION_VIEW, uri)
                    context.startActivity(launchBrowser)
                }else {
                    Toast.makeText(context, "Image URI Not Found", Toast.LENGTH_SHORT).show()
                }
                }
                binding.btnPizza.setOnClickListener {
                    if (item.website != null && item.website!!.isNotEmpty()) {
                        val uriUrl = Uri.parse(item.website)
                        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
                        if (launchBrowser.resolveActivity(context.packageManager) !=null){
                            context.startActivity(launchBrowser)
                        }else{
                            Toast.makeText(context,"No app available to handle the intent",Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(context, "URI is not Found", Toast.LENGTH_SHORT).show()
                    }
                }
                if (position == eList.size-1) {
                    binding.progress.visibility=View.VISIBLE
                }
            }
        }
    }

    class ViewHolder(val binding: SingleDealerBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    fun appendData(newList: List<Event?>) {
        eList.addAll(newList)
        notifyDataSetChanged()

    }

}