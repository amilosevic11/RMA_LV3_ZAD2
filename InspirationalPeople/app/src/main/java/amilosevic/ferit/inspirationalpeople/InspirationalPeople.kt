package amilosevic.ferit.inspirationalpeople

import android.app.Application

class InspirationalPeople : Application()
{
    companion object
    {
        lateinit var application: InspirationalPeople
    }

    override fun onCreate()
    {
        super.onCreate()
        application = this
    }
}