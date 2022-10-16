package coffee_shop

import kotlin.system.exitProcess

fun main() {
    val moscowCoffeeShop = MoscowCoffeeShop(3.0, 5.0, 4.0)
    val americanCoffeeShop = AmericanCoffeeShop(2.0, 5.0, 7.0)

    while (true){
        println("Привет! Выбери одно из заведений\n 1. Москва. \n 2. Нью-Йорк.\n\n 0. Exit!")

        when(readln()){
            "1" -> { println("Добро пожаловать в Москву!")
                makeCoffee(moscowCoffeeShop)
            }
            "2" -> {println("Добро пожаловать в Нью-Йорк!")
                makeCoffee(americanCoffeeShop)
            }
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }
    }
}
fun makeCoffee(coffeeShop: CoffeeShop){
    println("Выберите напиток:\n1. Americano\n2. Cappuccino\n3. Latte\n\n 0. Statistic")
    when(readln()){
        "1" -> {
            coffeeShop.makeAmericano()
            sellCookies(coffeeShop)
        }
        "2" -> {
            coffeeShop.makeCappuccino()
            sellCookies(coffeeShop)
        }
        "3" -> {
            coffeeShop.makeLatte()
            sellCookies(coffeeShop)
        }
        "0" -> coffeeShop.showStatistics()
        else -> {println("Error")
            exitProcess(1)
        }
    }
}
fun sellCookies(coffeeShop: CoffeeShop){
    if (coffeeShop is Cookies){
        println("Хотиту печенюшку??\n 1. Хочу\n 2. Не хочу")
        when(readln()){
            "1" -> coffeeShop.sellCookies()
        }
    }
}