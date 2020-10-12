class RunningSumOf1dArray {
    companion object {
        fun runningSum(nums: IntArray): IntArray {
            var result: ArrayList<Int> = ArrayList<Int>()
            var sum  = 0
            for(i in 0.. nums.size-1) {
                sum += nums[i]
                result.add(sum)
            }
            return result.toIntArray()
        }
    }
}