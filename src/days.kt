import java.util.*

fun main(args: Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println("what day is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Time has stopped"
    })
}