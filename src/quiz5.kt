
import java.util.*

fun main(args: Array<String>){

    val rollDice = { sides: Int -> Random().nextInt(sides) + 1 }


    val rollDice0 = { sides:Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    val rollDice2:(Int) -> Int = {sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice2(4))



}


fun gamePlay(diceRoll: Int){
    println(diceRoll)
}