package amilosevic.ferit.inspirationalpeople.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InspiringPeople")
data class InspiringPerson(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "quote") val quote: String,
    @ColumnInfo(name = "image") val image: String
)
{
}