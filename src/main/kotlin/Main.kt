fun main(){

    userName("Lucky", 23, "Kenya")

    var ans1 = printSum(12, 10, 4, 2)
    println(ans1)

    var result = findAverage(2.0, 5.1, 8.6, 6.6, 9.4, )
    println(result / 2)


    //4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

    var name ="Chepkemboi"
    println(name)
    var age :Byte = 22
    println( age)
    var phonenumber : String = "0745852120"
    println(phonenumber)
    val  weight =99
    var citizenshipkenya:Boolean =false
    println(citizenshipkenya)

}

//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and
// I am from Kenya” (2 points)

fun userName(name:String, age: Int, nationality: String){
    var ans = ("Hello my name is $name, I am $age and I am from $nationality")
    println(ans)
}


//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun printSum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum= num1 + num2 + num3 + num4
    return sum
}



//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)

fun findAverage(num1: Double, num2: Double, num3: Double, num4: Double, num5: Double): Double{
    return num1 + num2 + num3 + num4 + num5
}

