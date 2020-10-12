class ValidPalindrome {
    companion object {
        fun isPalindrome(s: String): Boolean {
            if (s.isEmpty()) {
                return true
            }
            var temp = s.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
            var n = temp.length
            for (i in 0..n-1) {
                if (temp[i] != temp[n-i-1]) {
                    return false
                }
            }
            print(temp)
            return true
        }
    }
}