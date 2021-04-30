package amilosevic.ferit.inspirationalpeople.activities

import amilosevic.ferit.inspirationalpeople.data.InspiringPeopleRepository
import amilosevic.ferit.inspirationalpeople.databinding.ActivityAddnewpersonBinding
import amilosevic.ferit.inspirationalpeople.model.InspiringPerson
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AddPersonActivity : AppCompatActivity()
{
    private lateinit var newPersonBinding: ActivityAddnewpersonBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        newPersonBinding = ActivityAddnewpersonBinding.inflate(layoutInflater)
        newPersonBinding.btnAddPerson.setOnClickListener{ addPerson() }

        setContentView(newPersonBinding.root)
    }

    private fun addPerson()
    {
        val name = newPersonBinding.etPersonName.text.toString()
        val date = newPersonBinding.etPersonDate.text.toString()
        val about = newPersonBinding.etPersonAbout.text.toString()
        val quote = newPersonBinding.etPersonQuote.text.toString()
        val image = newPersonBinding.etPersonImage.text.toString()
        val inspiringPerson = InspiringPerson(name, date, about, listOf(quote), image)

        InspiringPeopleRepository.addPerson(inspiringPerson)
        finish()
    }

}