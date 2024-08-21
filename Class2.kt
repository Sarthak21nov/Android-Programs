fun main() {
    val a = "Sarthak"
    val b = "Aryan"
    val result = "Two friends $a and $b travels to Delhi together"
    println(result)
    
    // Escape Sequence and Strings
    val letter: Char
    letter = 'A'
    print("$letter")
    print('\n')				 // Print on next line
    print('\$')				 // Print $
    println('\\')            // Prints single backslash
    
    val name = "Sarthak"
    print("$name\n")
    print("$name\n")
    print("$name\n")
    print("$name\n")
    print("$name\n")
    
    print('\n')
    print("$name\n")
    print("\t$name\n")
    print("\t\t$name\n")
    print("\t\t\t$name\n")
    print("\t\t\t\t$name\n")
    
    print("\n")
    
    print("\t$name\n")
    print("$name")
    print("\t\t$name")
    print("\t$name\n")
    
    // Arrays
    val numbers = arrayOf(1,2,3,4,5)   // Array of Integer
    print(numbers)
    val words: Array<String> = arrayOf("Hello","Hola","Halo")    // Array of String
    print(words)
    val sequence = Array(5){
        i -> i*i
    }   // Array of squares using lambda function
    print(sequence)
    val firstNumber = numbers[0]
    print(firstNumber)
    val firstWord = words[0]
    print(firstWord)
    
}