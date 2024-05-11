package com.kot104.kot_lab1

fun main() {
    var choice: String

    do {
        println("+========= TEST ========+")
        println("+  1. Test Biến         +")
        println("+  2. Test Thương       +")
        println("+  3. Test Filter       +")
        println("+  4. Test Map          +")
        println("+  5. Test Any          +")
        println("+  6. Test All          +")
        println("+  7. Test None         +")
        println("+  8. Test Find         +")
        print("Nhập lựa chọn (1, 2, 3,4,5,6,7,8, 00 to quit): ")

        choice = readln()!!.trim()  // Read input, trim whitespace, and store in choice

        if (choice != "00") {
            val choiceInt = choice.toIntOrNull()
            if (choiceInt != null) {
                when (choiceInt) {
                    1 -> test1()
                    2 -> test2()
                    3 -> test3()
                    4 -> test4()
                    5 -> test5()
                    6 -> test6()
                    7 -> test7()
                    8 -> test8()
                    else -> println("Lựa chọn không hợp lệ!")
                }
            } else {
                println("Invalid input. Please enter a number between 1 and 8 or '00' to quit.")
            }
        }
    } while (choice != "00")
}
fun test1() {
    val a = 1 // Sử dụng val để gán giá trị không đổi
    var b = 2 // Sử dụng var để gán giá trị có thể thay đổi
    val c= (a+b)
    val d : String = "Tổng 2 số $a và $b = $c"
    println(d)
}

fun test2() {
    println("Phép chia:")
    print("Nhập số a: ")
    val a = readLine()!!.toDouble()
    print("Nhập số b: ")
    val b = readLine()!!.toDouble()
    if(b==0.0) {
        println("Lỗi: Không thể chia cho 0!")
    }else{
        val c = a / b
        println("$a : $b =$c")
    }
}

fun test3() {
    println("filter")
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3
    println("Numbers:"+numbers)
    println("Positive Number:"+positives)
    println("Negatives Number:"+negatives)
}
fun test4(){
    println("MAP")
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3
    println("Numbers:"+numbers)
    println("Double Number:"+doubled)
    println("Tripled Number:"+tripled)
}
fun test5(){
    println("ANY")
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3
    println("Numbers:"+numbers)
    println("Is there any number less than 0:"+anyNegative)
    println("Is there any number greater than 6:"+anyGT6)
}
fun test6(){
    println("ALL")
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.all { it % 2 == 0 }            // 2

    val allLess6 = numbers.all { it < 6 }                // 3
    println("Numbers:"+numbers)
    println("All numbers are even: "+allEven)
    println("All numbers are less than 6: "+allLess6)
}
fun test7(){
    println("NONE")
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.none { it % 2 == 1 }           // 2

    val allLess6 = numbers.none { it > 6 }               // 3
    println("Number:"+ numbers)
    println("All number are even:"+ allEven)
    println("No element greater than6:"+allLess6)
}
fun test8() {
    println("Find")
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }  // Find the first element
    val last = words.findLast { it.startsWith("some") } // Find the last element

    val nothing = words.find { it.contains("nothing") } // Search for "nothing"

    println(first)
    println(last)
    if (nothing == null) {
        println("The word 'nothing' is not found in the collection.")
    } else {
        println("The word 'nothing' is found.")
    }
}