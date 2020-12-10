import kotlin.math.min
import kotlin.math.max

class NOD {
    fun getNod(a: Long, b: Long): Long {
        var r: Long
        var second:Long
        val list = mutableListOf<Pair<Long, Long>>()
        list.add(Pair(min(a,b),max(a,b)))
        for (i in 0..max(list.get(0).first,list.get(0).second)) {
            second = min(list.get(i.toInt()).first, list.get(i.toInt()).second)
            r = max(
                list.get(i.toInt()).first,
                list.get(i.toInt()).second
            )%second
            list.add(Pair(r,second))
            if (r==0L) break
        }
        return list.get(list.size-2).first
    }
}