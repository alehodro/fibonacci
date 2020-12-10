fun main() {
    val input = readLine()?.split(" ")
    val n = input?.get(0)?.toLong()
    val m = input?.get(1)?.toLong()
   // val fibbonator = Fibbonator()
    // println(fibbonator.getInt(n!!.toInt()))
    // println(fibbonator.getLastIntOfFibbonacciValue(n!!.toInt()))
   // println(if (n!=null&&m!=null)  fibbonator.getModOfFibbonacci_nAndM(n, m) else "null")
    val nod = NOD()
    println(if (n!=null&&m!=null)  nod.getNod(n,m) else "null")
    val n2 = input?.get(2)?.toLong()
    val m2 = input?.get(3)?.toLong()
    println(if (n2!=null&&m2!=null)  nod.getNod(n2,m2) else "null")
}