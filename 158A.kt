import java.lang.Math.ceil
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    val x = readInts()
    val a = x.get(0)
    val b = x.get(1)
    val c = readInts()
    val f = c.filter { it >= c.get(b-1) && it > 0 }
    println(f.count())
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
