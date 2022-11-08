package com.example.frippy.lists.Onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.frippy.R
import com.example.frippy.model.Onboarding

class OnboardingItemsAdapter(private  val onboardingitems : List<Onboarding> ):
    RecyclerView.Adapter<OnboardingItemsAdapter.OnboardingViewHolder>() {
    inner class OnboardingViewHolder(view : View):RecyclerView.ViewHolder(view){
        private val imageOnboarding = view.findViewById<ImageView>(R.id.imageOnboarding)
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)

        fun bind(onboarding: Onboarding){
        imageOnboarding.setImageResource(onboarding.Onboardingimage)
            textTitle.text = onboarding.Title
            textDescription.text = onboarding.Description
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        return OnboardingViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_item_container,parent,false
            ))    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        holder.bind(onboardingitems[position])
    }

    override fun getItemCount(): Int {
        return onboardingitems.count()
    }
}