import java.lang.Math.ceil
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    val n = readInt()
    var x = 0
    for(i in 0..n-1){
        val l = readLn().toLowerCase()
        if(l == "++x" || l=="x++"){
            x++
        }else x--
    }
    println(x)
 
 
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
