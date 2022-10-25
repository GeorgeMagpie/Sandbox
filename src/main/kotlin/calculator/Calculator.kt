fun main() {
    var z: Double
    println("Привет юзвер")
    while (true){
        println("Введите первое число")
        val x = readln().toDoubleOrNull()
        println("Введите второе число")
        val y = readln().toDoubleOrNull()
        println("Выберете оператор: +, -, * или /")
        val i = readln()
        if (x == null || y == null || i.isEmpty()){
            println("Введите корректные данные")
        } else {
            z = calc(x, y, i)
            println(" Ваш результат $z")
        }
    }

}

 fun calc(x: Double, y: Double, i: String): Double{
     val z = when(i){
         "+" -> x + y
         "-" -> x - y
         "*" -> x * y
         else ->  x / y
     }
     return z
 }





