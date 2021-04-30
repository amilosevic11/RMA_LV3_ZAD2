package amilosevic.ferit.inspirationalpeople.adapters

import amilosevic.ferit.inspirationalpeople.databinding.ItemInspirationalpeopleBinding
import amilosevic.ferit.inspirationalpeople.model.InspiringPerson
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class InspiringPersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    fun Bind(person: InspiringPerson)
    {
        val itemBinding = ItemInspirationalpeopleBinding.bind(itemView)

        itemBinding.tvInspirationalPeopleTitle.text = person.name
        itemBinding.tvInspirationalPeopleDescription.text = person.description
        itemBinding.tvInspirationalPeopleDateOfBirth.text = person.date

        Picasso.get().load(person.image).into(itemBinding.ivInspirationalPeopleItemImage)
    }
}