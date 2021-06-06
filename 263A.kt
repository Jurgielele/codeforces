import java.lang.Math.abs
import java.lang.Math.ceil
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    var someList: ArrayList<List<Int>> = arrayListOf()
    for(i in 0..4) someList.plusAssign(readInts())
    var y = 0
    var x = 0
    someList.forEachIndexed { index, list ->
        for(i in list){
            if(i == 1){
                y = index
            }
 
        }
    }
    x = someList[y].indexOf(1)
    val xc = kotlin.math.abs(y + 1 - 3) + kotlin.math.abs(x + 1 - 3)
    print(xc)
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
