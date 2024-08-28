fun demo(){
    println("Hello World")
}

// With default Arguement
fun sum(a:Int=10,b:Int=20){
    var c = a+b 
    println(c);
}

// Without default Arguement
fun sum(a:Int,b:Int,c:Int){
    var d = a+b+c
    println(d)
}

// Returning the result 
fun diff(a:Int,b:Int): Int{
    var ans = a - b;
    return ans
}

fun farenheit(a:Int):Int{
    var result1 = (9*a)/5 + 32 
    return result1;
}
fun celcius(a:Int):Int{
    var result1 = (a - 32) * 5/9 
    return result1;
}
fun fact(n:Int):Int{
    if(n<=1){
        return 1
    }
    return n * fact(n-1)
}
fun fibo(n:Int):Int{
    if(n<1){
        return n;
    }
    return fibo(n-1) + fibo(n-2)
}

fun main(args: Array<String>) {
    demo()
    println("After executing demo")
    sum(30,40)
    sum(10,40,70)
    sum()
    var ans = diff(50,30)
    println(ans)
    
    println()
    // Function to create temprature from celcius to farenheit
    var res = farenheit(30)
    println("$res degree farenheit")
    var res2 = celcius(86)
    println("$res2 degree celcius")
    println()
    
    // Recurssive Function
    // WAP TO PRINT FACTORIAL AND FIBONACCI NUMBER USING RECURSSIVE FUNCTION.	
    var fact = fact(5)
    println(fact)
    var fibo = fibo(5)
    println(fibo)
}
