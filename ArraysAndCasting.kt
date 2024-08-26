// Class 3(to be pushed on github)

fun main(){
    val numbers = arrayOf(1,2,3,4,5)   // Array of Integer
    println(numbers[0])
    val words: Array<String> = arrayOf("Hello","Hola","Halo")    // Array of String
    println(words[1])
    val sequence = Array(5){
        i -> i*i
    }   // Array of squares using lambda function

    // Printing full array
    for(i in sequence){
        print("$i\n")
    }
    print("\n")


//     Multi-dimentional array
    val multi_dim_arr: Array<Array<Int>> = arrayOf(arrayOf(1,2,3,4,5),arrayOf(6,7,8,9,0));
    print(multi_dim_arr[0][0])
    for(i in multi_dim_arr){
        for(j in multi_dim_arr){
            print(multi_dim_arr[i][j])
        }
        print("\n")
    }

    // Type Casting
    val x: Int =100
    val y: Long = x.toLong()
    println(y)

    // Unsafe casting
    val a = "hi"
    val b: String = a as String
    println("Unsafe cast Result: $b")    // work fine

    val num: Int = a as Int
    println("Unsafe Casting Resunt: $num")         //ClassCastException
}