package amilosevic.ferit.inspirationalpeople.model

import kotlin.random.Random

class InspiringPerson
(
        val name: String,
        val date: String,
        val description: String,
        private val quote: List<String>,
        val image: String
        )
{
    fun GetQuote(): String
    {
        return quote.elementAt(Random.nextInt(0, quote.count()))
    }
}