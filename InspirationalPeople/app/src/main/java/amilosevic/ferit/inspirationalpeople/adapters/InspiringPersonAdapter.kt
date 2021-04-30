package amilosevic.ferit.inspirationalpeople.adapters

import amilosevic.ferit.inspirationalpeople.R
import amilosevic.ferit.inspirationalpeople.interfaces.OnInspiringPersonImageSelectedListener
import amilosevic.ferit.inspirationalpeople.model.InspiringPerson
import android.provider.SyncStateContract.Helpers.update
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InspiringPersonAdapter(inspiringPeople: List<InspiringPerson>, private val onClickListener: OnInspiringPersonImageSelectedListener) : RecyclerView.Adapter<InspiringPersonViewHolder>()
{
    private val inspiringPpl: MutableList<InspiringPerson> = mutableListOf()
    init
    {
        update(inspiringPeople)
    }

    fun update(inspiringPeople: List<InspiringPerson>)
    {
        inspiringPpl.clear()
        inspiringPpl.addAll(inspiringPeople)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InspiringPersonViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_inspirationalpeople, parent, false)

        return InspiringPersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: InspiringPersonViewHolder, position: Int) {
        val person = inspiringPpl[position]
        holder.Bind(person)
        holder.itemView.setOnClickListener{ onClickListener.onInspiringPersonImageSelected(person) }
    }

    override fun getItemCount(): Int
    {
        return inspiringPpl.size
    }
}