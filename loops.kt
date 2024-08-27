fun main() {
    val kotlin = "27-08-24"
    println(kotlin)
    
    // Both inclusive
    for(i in 1..5){
        println("Number: $i")
    }
    println()
    
    // less than inclusive
    for(i in 10 until 15){
        println("Number: $i")
    }
    println()
    
    // Revrese loop
    for(i in 10 downTo 1){
        print("$i ")
    }
    println()
    
    // Reverse with step size
    for(i in 5 downTo 1 step 2){
        println("Numbers: $i");
    }
    println()
    
    // Iterating over the String
    for(i in "Sarthak"){
        print(i)
    }
    println()
    
    // Iterate over the list
    val fruits = listOf("Apple","Banana","Grapes")
    for(i in fruits){
        println("Fruits: $i")
    }
    for(i in fruits.indices){
        println("$i")
    }
    println()
    
    // While Loop
    var values = 5
    while(values > 0){
        println("Number is $values")
        values--
    }
    println()
    
    // do-while loop
    var values2 = 10
    do{
        println("Number is: $values2")
        values2--
    } while(values2>5)
    println()
    
    var res = 1
    do{
        println("$res")
        res++ 
    } while(res < 6)
    println()
}
