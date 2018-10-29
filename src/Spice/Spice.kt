package Spice

import Aquiarium.FishColor
import java.awt.Label

/*
class Spice(var name: String, var spiciness:String = "mild") {


    val heat:Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }}
}



fun main(args:Array<String>) {
    val spices1 = listOf(
            Spice.Spice("curry", "mild"),
            Spice.Spice("pepper", "medium"),
            Spice.Spice("cayenne", "spicy"),
            Spice.Spice("ginger", "mild"),
            Spice.Spice("red curry", "medium"),
            Spice.Spice("green curry", "mild"),
            Spice.Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice.Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}
}

fun makeSalt() = Spice.Spice("Salt")*/

abstract class Spice(val name: String, val spiciness:String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name:String, spiciness: String,color:SpiceColor = yellowSpiceColor):Spice(name,spiciness,color), Grinder {
    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object yellowSpiceColor: SpiceColor {
    override val color = "yellow"
}


data class SpiceContainer(val spice: Spice){
    val label = spice.name
}



fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("yellow curry","mild")),
            SpiceContainer(Curry("Red curry", "medium")),
            SpiceContainer(Curry("green curry", "spicy")))
    for (element in spiceCabinet) println(element.label)
}

