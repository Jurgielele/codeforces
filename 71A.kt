import java.util.*
 
fun main(args: Array<String>) {
    val r = readInt()
    for(i in 0..r-1){
        val s = readLine().toString()
        val count = s.count()
 
        if(count > 10){
            val x = count -2
            val string = s.removeRange(1..x)
            val fx_string = "${string.first()}$x${string.last()}"
            println(fx_string)
        }else{
            println(s)
        }
    }
 
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
