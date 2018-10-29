fun main(args:Array<String>){
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)
    println(testList.reversed())

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("jungle Book") {"kipling"}
    moreBooks.getOrPut("Hamlet") {"Shakespeare"}
    println(moreBooks)
}


