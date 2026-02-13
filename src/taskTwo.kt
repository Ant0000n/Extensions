/*.Написать функцию расширения конкатенации строк.*/
fun main() {
    val wordOne = "Антон"
    val wordTwo = "Пишет"
    println(wordOne.concatenate(wordTwo))
}

fun String.concatenate(wordTwo: String): String {
    return this + " $wordTwo"
}