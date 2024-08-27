fun main() {
    // DATE
    val kotlin = "26-08-24"
    println(kotlin)
    
    // CONTROL FLOW(if-else,if, when, while, for and do are flow control.)
    var age = 18
    if(age>=18){
        println("Adult")
    }
    else{
        println("Not an adult")
    }
    
    var temprature = 25
    if(temprature > 20){
        println("Its a hot day")
    } else{
        println("good weather")
    }
    
    println()
    
    
    var score = 66
    if(score >= 90){
        println("A")
    }
    else if(score >= 85){
        println("B")
    }
    else if(score >= 75){
        println("C")
    }
    else{
        println("D")
    }
    
    println()
    
    // Create a calculator
    var operation = '%'
    var num1 = 100;
    var num2 = 50
	if(operation == '+'){
        println(num1 + num2)
    }
    else if(operation == '-'){
        println(num1 - num2)
    }
    else if(operation == '*'){
        println(num1 * num2)
    }
    else if(operation == '/'){
        if(num2 == 0){
            println("Division by Zero error")
        } else{
             println(num1 / num2)
        }
       
    }
    else if(operation == '%'){
        println(num1 % num2)
    } else{
        println("Invalid operation")
    }
    
    println()
    
    // Age Categorization
    var age_years = 1034 
    if(age_years<13){
        println("child")
    }
    else if(age_years in 13..19){
        println("Teenager")
    }
    else if(age_years in 20..69){
        println("Senior")
    }
    else {
        println("Adult")
    }
    
    println()
    
    // When (used when we have multiple condition) ['Similar to switch-case']
    var dayOftheWeek = 16
    val dayName = when(dayOftheWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid" 
    }
    println(dayName)
    // 'when' as a statement
    var number = 10
    when{
        number % 2 == 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
        else -> println("Invalid entry found!!!")
    }
