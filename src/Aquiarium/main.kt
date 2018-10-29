package Aquiarium

fun main(args: Array<String>){
    buildAquarium()
    makeFish()
}


fun buildAquarium() {
    val myAuarium = Aquiarium()

    println("length: ${myAuarium.length} "+
    "Width: ${myAuarium.width} "+ "Height: ${myAuarium.height}")

    myAuarium.height = 80

    println("Height: ${myAuarium.height} cm")
    println("Volume: ${myAuarium.volume} liters")

    val smallAquarium = Aquiarium(length = 20, width = 15, height = 30)
    println("Samill aquariuum ${smallAquarium.volume} Liters")

    val myAquarium2 = Aquiarium(numberOfFish = 9)
    println("Small Aquarium2 : ${myAquarium2.volume} liters with "+
    "length ${myAquarium2.length} width ${myAquarium2.width} "+
    "height ${myAquarium2.height}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    /*val shark = Shark()
    val pleco = Placostomus()

    println("shark: ${shark.color} \nPlecostomus ${pleco.color}" )

    shark.eat()
    pleco.eat()*//**/
}