import kotlin.math.max

class Fibbonator {
    fun getFibbonacciValue(number: Int): Long {
        val list = mutableListOf(0L, 1L)
        for (i in 2..number) {
            list.add(list[i - 1] + list[i - 2])
            //  println("F$i:${list[i]}")
        }
        return list[number]
    }

    fun getLastIntOfFibbonacciValue(number: Int): Int {

        if (number <= 1) return max(number, 0)
        var first = 0
        var second = 1
        val counter = 1
        var temp: Int
        for (i in counter until number) {
            temp = (first + second) % 10
            first = second
            second = temp
        }
        return second
    }

    fun getModOfFibbonacci_nAndM(n: Long, m: Long): Int {
        val pizano = mutableListOf(0, 1)
        for (i in 2..m*6) {
            pizano.add(((pizano[(i - 1).toInt()] + pizano[(i - 2).toInt()])%m).toInt())
            if (pizano[pizano.size-1]==1&&pizano[pizano.size-2]==0) break
        }
        val mod = n%(pizano.size-2)
        val result = pizano[mod.toInt()]


        return result
    }
}