/*Написать функцию расширения возведения в квадрат целого числа*/
fun main(){
val value = 5
    println(value.getSquare())
}
fun Int.getSquare(): Int{
    return this * this
}