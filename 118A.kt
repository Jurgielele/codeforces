import java.lang.Math.ceil
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
 
fun main(args: Array<String>) {
    //"A", "O", "Y", "E", "U", "I"
    val vowels = arrayOf<String>("a", "o", "y", "e", "u", "i")
    val line = readLn().toLowerCase()
    val fx = StringBuilder()
    line.forEachIndexed { index, c ->
        if(c == 'a' || c=='o' ||c=='y' ||c=='e' ||c=='u' || c =='i'){
        }else{
            fx.append('.')
            fx.append(c)
        }
    }
    println(fx)
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
