import java.util.*

fun main() {
    students()

    africa()

    elements()
    println(people("Judy","Rebby","Maria"))


}
fun students(){
    var students= arrayOf("Mary","Becky","John","Dennis")
    println(students.contentToString())
}
fun africa(){
    var citiesArray= arrayOf("harare","mumbai","dodoma","jarkata")
    println("harare".capitalize())
    println("mumbai".capitalize())
    println("dodoma".capitalize())
    println("jarkata".capitalize())
    println(citiesArray.toString().uppercase())
}
fun elements() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sumElement = numbers[1]+numbers[4]
    println(sumElement)

    println(numbers.indexOf(158))

    println(numbers.sortedArray().contentToString())
}
fun people(name:String,name1:String,name2:String):String{
     var name= arrayOf("Judy","Rebby","Maria")
    return "JudyRebbyMaria"
}