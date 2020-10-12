class ShuffleTheArray {
    companion object {
        fun shuffle(nums: IntArray, n: Int): IntArray {
            var result: ArrayList<Int> = ArrayList<Int> ()
            for (i in 0..n-1) {
                result.add(nums[i])
                result.add(nums[n+i])
            }
            return result.toIntArray()
        }
    }
}