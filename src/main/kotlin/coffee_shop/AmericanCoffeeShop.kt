package coffee_shop

class AmericanCoffeeShop(americanoPrise: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CoffeeShop(americanoPrise, cappuccinoPrice, lattePrice) {

    override fun makeAmericano() {
        americanoCounter++
        println("Спасибо за покупку америконо в Америке!")
    }

    override fun makeLatte() {
        latteCounter++
        println("Спасибо за покупку латте в Америке")
    }

    override fun makeCappuccino() {
        cappuccinoCounter++
        println("Спасибо за покупку капучино в Америке!")
    }
}