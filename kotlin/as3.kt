fun main (){
    var name = "mary"
    var age = 17
//    println(name)
//    println(age)
    no2()
   no3()

}
fun no2 (){
    val number1 = 12
    val number2 = 10
    val number3 = 19

    println("Three numbers : $number1,$number2,$number3")
    val maximum = maxOf(number1, number2, number3)
    val minimum = minOf(number1, number2, number3)
    println("Maximum of above three numbers: $maximum")
    println("Minimum of above three numbers: $minimum")

}
fun no3() {
    val n1 = 72
    val n2 = 120
    var lcm: Int

    // maximum number between n1 and n2 is stored in lcm
    lcm = if (n1 > n2) n1 else n2

    // Always true
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }
}
