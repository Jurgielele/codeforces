import java.util.*
 
fun main(args: Array<String>) {
   val n = readInt()
    var s = 0
    for (i in 0..n-1){
        val y = readInts().sum()
        if(y > 1) s++
    }
    println(s)
 
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
