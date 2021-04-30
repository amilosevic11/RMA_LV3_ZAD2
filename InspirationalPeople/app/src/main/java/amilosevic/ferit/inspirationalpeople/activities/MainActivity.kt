package amilosevic.ferit.inspirationalpeople.activities

import amilosevic.ferit.inspirationalpeople.R
import amilosevic.ferit.inspirationalpeople.adapters.InspiringPersonAdapter
import amilosevic.ferit.inspirationalpeople.data.InspiringPeopleRepository
import amilosevic.ferit.inspirationalpeople.databinding.ActivityMainBinding
import amilosevic.ferit.inspirationalpeople.interfaces.OnInspiringPersonImageSelectedListener
import amilosevic.ferit.inspirationalpeople.model.InspiringPerson
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity(), OnInspiringPersonImageSelectedListener {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var onInspiringPersonImageSelectedListener: OnInspiringPersonImageSelectedListener

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        onInspiringPersonImageSelectedListener = this@MainActivity

        mainBinding.fabAddPerson.setOnClickListener{ addPerson() }

        SetupRecyclerView()

        setContentView(mainBinding.root)
    }

    private fun SetupRecyclerView()
    {
        mainBinding.rvInspirationalPeople.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mainBinding.rvInspirationalPeople.adapter = InspiringPersonAdapter(InspiringPeopleRepository.getPeople(), onInspiringPersonImageSelectedListener)
    }

    override fun onInspiringPersonImageSelected(person: InspiringPerson)
    {
        Toast.makeText(applicationContext, person.GetQuote(), Toast.LENGTH_SHORT).show()
    }

    fun addPerson()
    {
        val addPersonIntent = Intent(this, AddPersonActivity::class.java)

        startActivity(addPersonIntent)
    }

    override fun onResume()
    {
        super.onResume()
        (mainBinding.rvInspirationalPeople.adapter as InspiringPersonAdapter).update(InspiringPeopleRepository.getPeople())
    }

}