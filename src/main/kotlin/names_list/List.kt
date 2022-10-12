package names_list

private const val HELLO = "Здравствуй, пользователь!"
private const val NAMES_ASK = "Введите список имен через запятую (без пробелов)"
private const val SALARY_ASK = "Введите зарплаты через запятую (бьез пробелов) в порядке введения иимен!!"

fun main() {
    println(HELLO)
    println(NAMES_ASK)

    val names = readln()
    val namesArray = names.split(",")

    println(SALARY_ASK)
    val salary = readln()
    val salaryArray = salary.split(",")

    validateLength(namesArray, 12, "Name")
    validateLength(salaryArray, 10, "Salary")
    printTable(namesArray, salaryArray)
}

fun printTable(namesArray: List<String>, salaryArray: List<String>) {
    println("-".repeat(33))
    for (salary in salaryArray){
        val index = salaryArray.indexOf(salary)
        val name = namesArray[index]
        val f1 = (16 - name.length) / 2
        val f2 = 16 - f1 - name.length
        val s1 = (14 - salary.length) / 2
        val s2 = 14 - s1 - salary.length
        print("|")
        print(" ".repeat(f1))
        print(name)
        print(" ".repeat(f2))
        print("|")
        print(" ".repeat(s1))
        print(salary)
        print(" ".repeat(s2))
        println("|")

    }
    println("-".repeat(33))
}

fun validateLength(namesArray: List<String>, length: Int, entry: String) {
    for (name in  namesArray){
        if (name.length > length){
            println("$entry превышает значение $length для данной таблицы!")
            break
        } else println(name)

    }

}
