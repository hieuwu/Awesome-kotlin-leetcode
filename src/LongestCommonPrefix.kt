class LongestCommonPrefix {

    companion object {
        fun longestCommonPrefix(strs: Array<String>): String {
            if (strs.size < 1) {
                return ""
            }
            var result:StringBuilder ?= StringBuilder("")
            for(j in 0 until strMinLength(strs)) {
                var index:Int = 0
                for( i in 0 until strs.size-1){
                    if(strs[i][j] != strs[i+1][j])
                    {
                        return result.toString()
                    }
                    index = i
                }
                result!!.append(strs[index][j])
            }
            return result.toString()
        }

        private fun strMinLength(strs: Array<String>): Int {
            var min:Int = strs[0].length
            for(i in strs.indices) {
                if (strs[i].length <= min) {
                    min = strs[i].length
                }
            }
            return min
        }
    }


}