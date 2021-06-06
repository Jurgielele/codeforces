fun main(args: Array<String>) {
    println(solution())
}
 
fun solution():String {
        val y = readInt()
        val nums = arrayOf<Int>(4,7,44,47,444,447,477,744,747,777)
        for(i in 0..nums.size-1){
            if(nums[i]==y) return "YES"
            else{
                if(y%nums[i]==0)return "YES"
            }
        }
    return "NO"
}
 
 
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
