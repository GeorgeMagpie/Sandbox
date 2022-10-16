package coffee_shop

import kotlin.system.exitProcess

fun main() {

    println("Привет! Выбери одно из заведений\n 1. Москва. \n 2. Нью-Йорк.")

    when(readln()){
       "1" -> { println("Добро пожаловать в Москву!")
           val moscowCoffeeShop = MoscowCoffeeShop(3.0, 5.0, 4.0)
           makeCoffee(moscowCoffeeShop)
       }
       "2" -> {println("Добро пожаловать в Нью-Йорк!")
           val americanCoffeeShop = AmericanCoffeeShop(2.0, 5.0, 7.0)
           makeCoffee(americanCoffeeShop)
       }   else -> {
           println("Error")
           exitProcess(1)
       }
    }
}
fun makeCoffee(coffeeShop: CoffeeShop){
    println("Выберите напиток:\n1. Americano\n2. Cappuccino\n3. Latte")
    when(readln()){
        "1" -> coffeeShop.makeAmericano()
        "2" -> coffeeShop.makeCappuccino()
        "3" -> coffeeShop.makeLatte()
        else -> {println("Error")
            exitProcess(1)
        }
    }

    if (coffeeShop is Cookies){
        println("Хотиту печенюшку??\n 1. Хочу\n 2. Не хочу")
        when(readln()){
            "1" -> coffeeShop.sellCookies()
        }
    }
}