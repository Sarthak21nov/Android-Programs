/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
class Person{                       // class
    var greet = "Hello Bro"
    fun callGreet(){                // method of a clas.
        println(greet)
    }
}

fun greet(){                // function defination
    var name = "Hello"   // Local Variable
    println(name)
}

fun main(args:Array<String>) {

    // use of var
    var a = 40
    println(a)

    // use of val
    val pi = 3.14
    println(pi)

    // using keywords as variable
    var `try` = 30
    println(`try`)
//     pi = 40
//     println(pi)
    // The above line will result in error that
    var b : Int
    b = 78
    println(b)


    // function call
    greet()

//     print(name)    // Accessing local Variable error

    // To use class methods we have to instanciate it and then call the methods of the class.
    val person = Person()
    person.callGreet()

}