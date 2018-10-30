package Aquiarium.generics

open class WaterSupply(var needsProcessed:Boolean)

class TapWater: WaterSupply(true){
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T>(val waterSupply: T)

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
}