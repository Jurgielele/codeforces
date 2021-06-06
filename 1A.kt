import java.lang.Math.ceil
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    val read = readInts()
    val x = read.get(0).toDouble()
    val y = read.get(1).toDouble()
    val a = read.get(2).toDouble()
    var squares = (ceil(x/a)*ceil(y/a)).toLong()
 
    println(squares)
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
