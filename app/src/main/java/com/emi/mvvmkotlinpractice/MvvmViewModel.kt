package com.emi.mvvmkotlinpractice

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import java.text.SimpleDateFormat
import java.util.*

class MvvmViewModel(val mArticle : Articles) : BaseObservable(){

    var title : String?
    @Bindable
    get() = mArticle.title
    set(title){
        mArticle.title = title
        notifyPropertyChanged(BR.title)
    }

    var subtitle : String?
    @Bindable
    get() = mArticle.subtitle
    set(subtitle){
        mArticle.subtitle = subtitle
        notifyPropertyChanged(BR.subtitle)
    }

    var excerpt : String?
    @Bindable
    get() = mArticle.excerpt
    set(excerpt){
        mArticle.excerpt = excerpt
        notifyPropertyChanged(BR.excerpt)
    }

    val formattedDate : String?
    @Bindable
    get() {
        val sdf = SimpleDateFormat("MM dd yyyy", Locale.getDefault())
        return sdf.format(mArticle.date)
    }

    fun setDate(date : Date){
        mArticle.date = date
        notifyPropertyChanged(BR.formattedDate)
    }


}