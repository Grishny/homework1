fun main() {
    //получение факториала числа
    println("Введите число:")
    val value = readln().toInt()
    val factorial = factorial(value)
    println("Факториал числа $value равен $factorial")

    //проверка простоты числа, есть вопрос: как указать, что 1 является исключением?
    println("Введите число:")
    val number = readln().toInt()
    if (primeNumber(number)) {
        println("$number — простое число.")
    } else {
        println("$number — составное число.")
    }

    //переворот строки
    println("Введите строку:")
    val line = readln()
    val reversed = reversed(line)
    println("Ваша строка в обратном порядке - $reversed")
}

fun factorial(value: Int): Int {
    var product = 1
    for (number in 1..value) {
        product *= value
    }
    return product
}

fun primeNumber(number: Int): Boolean {
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

fun reversed(line: String): String{
    return line.reversed()
}
