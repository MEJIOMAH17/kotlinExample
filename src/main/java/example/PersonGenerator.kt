package example
import java.util.*
import kotlin.collections.ArrayList

class PersonGenerator{
    private val nameList = arrayOf("Петя", "Вася", "Женя", "Марк", "Иван", "Леопольд");
    fun generate(): List<Person> {
        val random = Random()
        val personList = ArrayList<Person>()
        for (i in 1..15) {
            personList.add(Person(nameList.get(random.nextInt(nameList.size)), random.nextInt(30) + 18))
        }
        return personList;
    }
}
