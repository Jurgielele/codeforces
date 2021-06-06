import java.lang.Math.abs
import java.lang.Math.ceil
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    val x = readLn()
    var zeros = 0
    var ones = 0
    var dang = false
    x.forEach{
        if(it == '0'){
            ones = 0
            zeros +=1
            if(zeros == 7) dang=true
        }else{
            zeros = 0
            ones +=1
            if(ones==7) {
                dang = true
            }
        }
}
    if(dang){
        println("YES")
    }else{
        println("NO")
    }
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
