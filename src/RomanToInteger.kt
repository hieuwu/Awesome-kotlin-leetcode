class RomanToInteger {
    companion object {
        fun romanToInt(s: String): Int {
            var symMap:HashMap<Char, Int> = HashMap<Char, Int>()
            symMap.put('I', 1)
            symMap.put('V', 5)
            symMap.put('X', 10)
            symMap.put('L', 50)
            symMap.put('C', 100)
            symMap.put('D', 500)
            symMap.put('M', 1000)
            var result:Int = 0
            for(i in 0 ..s.length -1 ) {
                result += symMap.get(s[i])!!
                if (i >0 ) {
                    var last: Int =symMap.get(s[i-1])!!
                    var current:Int = symMap.get(s[i])!!
                    if(current > last)
                    {
                        result -= 2* symMap.get(s[i-1])!!
                    }
                }

            }
            return result
        }
    }
}