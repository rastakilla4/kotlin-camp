import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
    eagerExample()
}
fun getDirtySensorReading() = 20

fun  shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()) : Boolean{
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fisFood(day)
    println("Today is $day an the fish eat $food")
    shouldChangeWater(day,20,50)
    shouldChangeWater(day)
}

fun randomDay(): String {
    val week = listOf("Manday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fisFood(day: String) : String {

    return when (day) {
        "Manday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}


fun eagerExample() {
    val decorations = listOf("rock", "pagonda", "plastic plant", "aligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    //apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}

fun canAddFish(tankSize: Double,
               currentFish: List<Int>, fishSize:Int = 2, hasDecorarions: Boolean = true): Boolean {
    return (tankSize * if (hasDecorarions) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}