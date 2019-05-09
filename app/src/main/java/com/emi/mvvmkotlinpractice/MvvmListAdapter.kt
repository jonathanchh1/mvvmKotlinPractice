package com.emi.mvvmkotlinpractice

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.emi.mvvmkotlinpractice.databinding.RowItemBinding

class MvvmListAdapter(private val mArticle : List<Articles>) : RecyclerView.Adapter<MvvmListAdapter.BindingViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
           val binding = DataBindingUtil.inflate<RowItemBinding>(
               LayoutInflater.from(parent.context),
               R.layout.row_item,
               parent, false)
        return BindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val binding = holder.binding
        binding.mvm = MvvmViewModel(mArticle[position])
    }

    override fun getItemCount(): Int {
        return mArticle.size
    }


    inner class BindingViewHolder(val binding : RowItemBinding) : RecyclerView.ViewHolder(binding.mainLayout)
}