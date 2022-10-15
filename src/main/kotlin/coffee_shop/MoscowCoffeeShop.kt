package coffee_shop

class MoscowCoffeeShop(americanoPrise: Double, cappuccinoPrice: Double, lattePrice: Double )
      : CoffeeShop(americanoPrise, cappuccinoPrice, lattePrice) {


    override fun makeAmericano() {
        americanoCounter++
        println("Спасибо за покупку америконо в Москве!")
    }

    override fun makeLatte() {
        latteCounter++
        println("Спасибо за покупку латте в Москве!")
    }

    override fun makeCappuccino() {
        cappuccinoCounter++
        println("Спасибо за покупку капучино в Москве!")
    }
}