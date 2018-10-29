
class Bookk(val title:String, val author:String, val year:Int){

    fun information() :Pair<String, String> {
        return (title to author)
    }

    fun allInfo(): Triple<String,String,Int>{
        return Triple(title, author ,year)
    }

}


fun main(args: Array<String>){
    val b = Bookk("mariposa", "mcArtur", 1678)
    println("your book ${b.information().first} del autor ${b.information().second}")
    println("la iformacion del libro es: Titulo ${b.allInfo().first}/ Autor: ${b.allInfo().second}/ año: ${b.allInfo().third}")
}