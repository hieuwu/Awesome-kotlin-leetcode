class ReverseInteger {
    companion object {
        fun reverse(x: Int): Int {
            var temp: Int = x
            var result = 0
            var last:Int
            while (temp != 0) {
                last = temp % 10
                temp /= 10
                if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && last > 7))
                    return 0
                if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && last <= -8))
                    return 0
                result = result* 10 + last
            }
            return result
        }
    }
}
