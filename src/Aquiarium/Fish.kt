package Aquiarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int){

    val size: Int

    init {
        println("firs init block")
    }

    constructor(): this(true, 9){
        println("runnig secondary cosntructor")
    }

    init {
        if (friendly){
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    fun fishExample() {
        val fish = Fish(true, 20)
        println("Is the fish friendly? ${fish.friendly}. it neds volume ${fish.size}")
    }
}