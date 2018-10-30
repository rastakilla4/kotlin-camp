package Aquiarium

data class Fish2(var name:String)

fun main(args: Array<String>){
    fishExamples()
}

fun fishExamples() {
    val fish = Fish2("splahy")

    with(fish.name) {
        this.capitalize()
    }
}