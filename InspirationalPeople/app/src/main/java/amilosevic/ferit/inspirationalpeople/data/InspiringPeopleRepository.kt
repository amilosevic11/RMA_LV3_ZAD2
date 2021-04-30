package amilosevic.ferit.inspirationalpeople.data

import amilosevic.ferit.inspirationalpeople.model.InspiringPerson

object InspiringPeopleRepository
{
    private val inspiringPeople = mutableListOf<InspiringPerson>(
            InspiringPerson("Bjarne Stroustrup", "20.12.1950.", "Danish computer scientist", listOf("Bjarne Stroustrup: C makes it easy to shoot yourself in the foot; C++ makes it harder, but when you do it blows your whole leg off", "Bjarne Stroustrup: Thus, the STL will serve both as a tool and as a teacher"), "https://upload.wikimedia.org/wikipedia/commons/d/da/BjarneStroustrup.jpg"),
            InspiringPerson("Guido van Rossum", "31.01.1956.", "Dutch programmer, the creator of the Python", listOf("Guido van Rossum: Gawky and proud of it", "Guido van Rossum: Astalavista"),"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Guido-portrait-2014-drc.jpg/800px-Guido-portrait-2014-drc.jpg"),
            InspiringPerson("Sundar Pichai", "12.05.1972", "CEO of Alphabet and Google", listOf("Sundar Pichai: We value your privacy!", "Sundar Pichai: Wear your failures as a badge of honor"),"https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Sundar_Pichai_WEF_2020.png/320px-Sundar_Pichai_WEF_2020.png"),
            InspiringPerson("Silvio Kutić", "09.12.1977.", "Founder of Infobip", listOf("Silvio Kutić: Zaposlio sam se u Elektri i drugi dan dao otkaz", "Silvio Kutić: Kroz greške smo učili"),"https://lider.media/images/slike/2019/09/12/o_8251_1024.jpg"),
            InspiringPerson("Mate Rimac", "21.19.1988.", "CEO of Rimac Automobili and Greyp Bikes", listOf("Mate Rimac: Richard Hammond mi je slupao c_one", "Mate Rimac: Otvaramo novi kampus."),"https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Rimac_%28102%29.jpg/800px-Rimac_%28102%29.jpg"),
            InspiringPerson("Dennis MacAlistair Ritchie", "09.08.1941.", "American computer scientist, creator of the C", listOf("Dennis Ritchie: C is very powerful language", "Dennis Ritchie: C, C++ and C# FTW"), "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Dennis_Ritchie_2011.jpg/320px-Dennis_Ritchie_2011.jpg")
    )

    fun getPeople() : List<InspiringPerson>
    {
        return inspiringPeople
    }

    fun addPerson(person: InspiringPerson)
    {
        inspiringPeople.add(person)
    }
}