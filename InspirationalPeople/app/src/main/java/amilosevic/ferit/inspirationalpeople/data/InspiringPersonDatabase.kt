package amilosevic.ferit.inspirationalpeople.data

import amilosevic.ferit.inspirationalpeople.InspirationalPeople
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(version = 1, entities = arrayOf(InspiringPerson::class))
abstract class InspiringPersonDatabase : RoomDatabase()
{
    abstract fun inspiringPeopleDao() : InspiringPersonDao

    companion object
    {
        private const val NAME = "inspringPeople_database"
        private var INSTANCE : InspiringPersonDatabase? = null

        fun getInstance() : InspiringPersonDatabase
        {
            if(INSTANCE == null)
            {
                INSTANCE = Room.databaseBuilder(
                    InspirationalPeople.application,
                    InspiringPersonDatabase::class.java,
                    NAME
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE as InspiringPersonDatabase
        }
    }
}