fun main() {
    println("Привет юзвер")
    println("Введите первое число")
    val x = readln().toInt()
    println("Введите второе число")
    val y = readln().toInt()
    println("Выберете оператор: +, -, * или /")
    val i = readln()
    val z = calc(x, y, i)
    println(" Ваш результат $z")
}

 fun calc(x: Int, y: Int, i: String): Int{
     val z = when(i){
         "+" -> x + y
         "-" -> x - y
         "*" -> x * y
         else ->  x / y
     }
     return z
 }



