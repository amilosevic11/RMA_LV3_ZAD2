package amilosevic.ferit.inspirationalpeople.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "InspiringPeople")
data class InspiringPerson(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Date of birth (and death)") val date: String,
    @ColumnInfo(name = "Famous quote") val quote: String,
    @ColumnInfo(name = "Image") val image: String
)
{
}