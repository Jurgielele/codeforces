import java.lang.Math.abs
import java.lang.Math.ceil
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    println(sol())
}
 
fun sol(): String {
    val x = readLn().toLowerCase()
    val s = "hello"
    var l = 0
    for(i in 0..x.length-1){
        if(x[i]==s[l])
            l+=1
        if (l==5){
            return "YES"
        }
    }
    return "NO"
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
