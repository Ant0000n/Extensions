/*Написать функцию получения квадратного корня из целого числа*/

fun main(){
    val value = 25
    println(value.squareRoot())
}
fun Int.squareRoot(): Int {
    var result = 0
    for (i in 1..this) {
        if (i * i == this) result = i
    }
    return result
}