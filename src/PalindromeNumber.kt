class PalindromeNumber {
    companion object {
        fun isPalindrome(x: Int): Boolean {
            var rev:Int = 0
            var pop:Int = 0
            var temp = x
            while(temp > 0) {
                pop = temp % 10
                rev = rev * 10 + pop
                temp /= 10
            }
            if (rev == x)
                return true

            return false
        }
    }
}