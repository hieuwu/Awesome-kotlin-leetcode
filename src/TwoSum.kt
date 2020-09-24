class TwoSum {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val result = ArrayList<Int>()
            val myMap = HashMap<Int,Int>()
            for (i in nums.indices) {
                val sub = target - nums[i]
                if (myMap.containsKey(sub)) {
                    result.add(myMap[sub]!!)
                    result.add(i)
                    return result.toIntArray()
                } else {
                    myMap.put(nums[i],i)
                }
            }
            return result.toIntArray()
    }

}
}