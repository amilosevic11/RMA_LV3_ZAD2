package amilosevic.ferit.inspirationalpeople.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface InspiringPersonDao
{
    @Insert
    fun insertPerson(person: InspiringPerson)

    @Delete
    fun deletePerson(person: InspiringPerson)

    @Query("SELECT * FROM InspiringPeople")
    fun getAll() : List<InspiringPerson>

    @Query("SELECT * FROM InspiringPeople WHERE name = :name")
    fun getByName(name: String) : List<InspiringPerson>
}