import java.util.*

class ValidParentheses {
    companion object {
        fun isValid(s: String): Boolean {
            if (s.length % 2 !=0) {
                return false
            }
            var openBracket: Stack<Int> = Stack<Int>()
            for(i in s.indices) {
                if (s[i] == '(') {
                    openBracket.push(1)
                }
                if (s[i] == '[') {
                    openBracket.push(2)
                }
                if (s[i] == '{') {
                    openBracket.push(3)
                }
                if (s[i] == ')') {
                    if(openBracket.isEmpty()) {
                        return false
                    }

                    if(openBracket.last() == 1) {
                        openBracket.pop()
                    }
                    else{
                        return false
                    }
                }
                if (s[i] == ']') {
                    if(openBracket.isEmpty()) {
                        return false
                    }
                    if(openBracket.last() == 2) {
                        openBracket.pop()
                    }
                    else{
                        return false
                    }
                }
                if (s[i] == '}') {
                    if(openBracket.isEmpty()) {
                        return false
                    }
                    if(openBracket.last() == 3) {
                        openBracket.pop()
                    }
                    else{
                        return false
                    }
                }
            }
            if (!openBracket.isEmpty()) {
                return false
            }

            return true
        }
    }
}