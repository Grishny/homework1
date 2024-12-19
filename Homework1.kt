fun main() {
    //получение факториала числа
    println("Введите число:")
    val value = readln().toInt()
    val factorial = factorial(value)
    println("Факториал числа $value равен $factorial")

    //проверка простоты числа, есть вопрос: как указать, что 1 является исключением?
    println("Введите число:")
    val number = readln().toInt()
    if (checkPrimeNumber(number)) {
        println("$number — простое число.")
    } else {
        println("$number — составное число.")
    }

    //переворот строки
    println("Введите строку:")
    val line = readln()
    val invertedLine = invertedLine(line)
    println("Ваша строка в обратном порядке - $invertedLine")
}

fun factorial(value: Int): Int {
    var product = 1
    for (number in 1..value) {
        product *= number
    }
    return product
}

fun checkPrimeNumber(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun invertedLine(line: String): String{
    return line.reversed()
}
