mport java.lang.Math.abs
import java.lang.Math.ceil
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    var x: ArrayList<List<Int>> = arrayListOf()
    var n = readInt()
    for(i in 0..n-1) x.plusAssign(readInts())
    var x1=0
    var y1=0
    var z1=0
    for(i in 0..n-1){
        for(j in 0..2){
            x1 += x[i][0]
            y1 += x[i][1]
            z1 += x[i][2]
        }
    }
    if(x1==0 && y1==0 && z1==0) println("YES")
    else println("NO")
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
