//addition
//fun add() {
    //print(100 + 20)
//}
//fun main(args: Array<String>) {
    //add()
//}

//multiple arithmetic in kotlin

class Calc { //define class to continue with the arithmetic
    fun add(x: Float, y: Float) = x + y
    fun sub(x: Float, y: Float) = x - y
    fun mult(x: Float, y: Float) = x * y
    fun div(x: Float, y: Float) = x / y
}

fun main(args: Array<String>) {
    val calc = Calc()
    println(calc.add(50F, 50F))
    println(calc.sub(50F, 50F))
    println(calc.mult(50F, 50F))
    println(calc.div(50F, 50F))
}

