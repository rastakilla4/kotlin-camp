open class Book(var title:String, var author:String){



    private var currentPage:Int = 1

    object Constanst {
        const val MAX_NUMBER_BOOKS = 20
        const val BASE_URL = "http"
    }

    open fun readPage(){
        currentPage++
        println(Constanst.BASE_URL)
    }

    companion object {
        val BASE_URL = "http"
    }

    fun Book.weight() : Double {return  (currentPage *1.5)}

    fun Book.tornPages(torn: Int) = if (currentPage >=torn) currentPage -= torn else currentPage = 0

}


class eBook(title: String, author: String, var format:String = "text"): Book(title,author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}
