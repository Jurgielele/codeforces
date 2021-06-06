import java.util.*
 
fun main(args: Array<String>) {
    val x = readInts()
    val a = x.get(0)
    val b = x.get(1)
    val y = a*b
 
    if(y%2 == 0){
        println(y/2)
    }else{
        println((y-1)/2)
    }
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
