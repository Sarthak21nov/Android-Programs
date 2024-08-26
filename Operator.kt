// class 4 to be pushed to github.

fun main(){
    // Operators
    // Arithematic Operator
    var a = 10;
    var b = 5;
    println(" $a + $b = ${a+b}")
    println(" $a - $b = ${a-b}")
    println(" $a * $b = ${a*b}")
    println(" $a / $b = ${a/b}")
    println(" $a % $b = ${a%b}")

    println()

    // Relational Operators
    println("$a > $b = ${a>b}")
    println("$a < $b = ${a<b}")
    println("$a >= $b = ${a>=b}")
    println("$a <= $b = ${a<=b}")
    println("$a == $b = ${a==b}")
    println("$a != $b = ${a!=b}")

    println()

    //Assignment Operator
    var c = 30;
    c = c + 10;
    println(c)
    c = c-10
    println(c)
    c = c*10
    println(c)
    c = c/10
    println(c)
    c = c%10
    println(c)

    println()

    // Unary Operator
    var d = 10
    println(+d)
    println(-d)
    println(++d)
    println(--d)

    println()

    //Logical Operator
    var isTrue = true
    var isFalse = false
    println(isTrue && isFalse)
    println(isTrue || isFalse)
    println(!isTrue)

    // Bitwise Operators
}