package main

import "fmt"

/*
数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。

示例 1：
输入：[1,2,5,9,5,9,5,5,5]
输出：5

示例 2：
输入：[3,2]
输出：-1

示例 3：

输入：[2,2,1,1,1,2,2]
输出：2
*/

func main() {
	nums := []int{1,2,5,9,5,9,5,5,5}
	fmt.Println(majorityElement(nums))
	fmt.Println(majorityElement2(nums))

	nums = []int{11,11,11,22,22,22,22}
	fmt.Println(majorityElement(nums))
	fmt.Println(majorityElement2(nums))
}

func majorityElement(nums []int) int {
	res := make(map[int]int)
	for _, num := range nums {
		res[num] += 1
	}
	r := 0
	num := 0
	for key,value := range res {
		if r < value {
			r = value
			num = key
		}
	}
	return num
}

func majorityElement2(nums []int) int {
	majority := pairing(nums)
	votes := counting(nums, majority)
	if votes <= len(nums) / 2 {
		majority = -1
	}
	return majority
}

func pairing(nums []int) int {
	majority, votes := -1, 0
	for _, num := range nums {
		if votes == 0 {
			majority = num
			votes = 1
		} else {
			if num == majority {
				votes++
			} else {
				votes--
			}
		}
	}
	return majority
}

func counting(nums []int, majority int) int {
	votes := 0
	for _, num := range nums {
		if num == majority {
			votes++
		}
	}
	return votes
}
