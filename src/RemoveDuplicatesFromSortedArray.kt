class RemoveDuplicatesFromSortedArray {
    companion object {
        fun removeDuplicates(nums: IntArray): Int {
            if (nums.isEmpty()) return 0
            if (nums.size == 2 && nums[0] != nums[1]) return nums.size

            var i:Int = 0
            for (j in 1.. nums.size-1) {
                if (nums[i] != nums[j]) {
                    i++
                    nums[i] = nums[j]
                }
            }
            
            return i+1
        }
    }
}