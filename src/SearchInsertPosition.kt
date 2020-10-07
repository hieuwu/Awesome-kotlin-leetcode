class SearchInsertPosition {
    companion object {
        fun searchInsert(nums: IntArray, target: Int): Int {
            if (nums.contains(target)) {
                return nums.indexOf(target)
            }
            for(i in nums.indices) {
                if (target < nums[i]) {
                    return i
                }
                if(target > nums[nums.size -1] ) {
                    return nums.size
                }
            }
            return 0
        }
    }
}