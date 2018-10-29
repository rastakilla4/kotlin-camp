

fun main(args: Array<String>) {
    println(whatShouldDoToday("happy","sunny"))
    println(whatShouldDoToday("sad"))
    println("how do you feel?")
    println(whatShouldDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35

fun isSadRainyCold(mood:String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny  (mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldDoToday(mood:String, weather:String  = "sunny", temperature:Int = 24): String{
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood ,weather) -> "go for a walk"
        else -> "stay home and read"
    }
}