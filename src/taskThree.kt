/*3.Написать функцию расширения определения последнего индекса в строке.*/

fun main() {
    val stroke = "Привет! Я Антон"
    println(stroke.getLast())
}

fun String.getLast():Int{
    return this.length - 1
}