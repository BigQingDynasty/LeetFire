package main

import (
	"fmt"
)

/*
给定一个整数数组，找出总和最大的连续数列，并返回总和。

示例：

输入： [-2,1,-3,4,-1,2,1,-5,4]
输出： 6
解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
*/

func main() {
	nums := []int{-2,1,-3,4,-1,2,1,-5,4}
	fmt.Println(maxSubArray(nums))

	nums = []int{1,2,3,4,5,6,-7}
	fmt.Println(maxSubArray(nums))
}

func maxSubArray(nums []int) int {
	max := nums[0]
	for i := 1; i < len(nums); i++ {
		if nums[i] + nums[i-1] > nums[i] {
			nums[i] += nums[i-1]
		}
		if nums[i] > max {
			max = nums[i]
		}
	}
	return max
}
