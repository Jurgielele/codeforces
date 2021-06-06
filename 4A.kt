fun main(args: Array<String>) {
    val n = readInt()
    if(n%2 ==0 && n!=2){
        println("YES")
    }else {
        println("NO")
    }
}
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
