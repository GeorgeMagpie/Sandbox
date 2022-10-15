package coffee_shop

abstract class CoffeeShop(val americanoPrise: Double, val cappuccinoPrice:Double, val lattePrice: Double ) {
    var americanoCounter = 0
    var cappuccinoCounter = 0
    var latteCounter = 0

    abstract fun makeAmericano()
    abstract fun makeLatte()
    abstract fun makeCappuccino()
}