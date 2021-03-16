package main

import "fmt"

/*
给定一个已按照 升序排列的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。

函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。

你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

示例 1：

输入：numbers = [2,7,11,15], target = 9
输出：[1,2]
解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
示例 2：

输入：numbers = [2,3,4], target = 6
输出：[1,3]
示例 3：

输入：numbers = [-1,0], target = -1
输出：[1,2]

*/

func main() {

	numbers := []int{1,2,3,4,5,6}
	target := 11
	fmt.Println(fmt.Sprintf("numbers--->: %v   \ntarget--->: %d", numbers, target))
	fmt.Println("方法一: ",sum1(numbers, target))
	fmt.Println("方法二: ", sum2(numbers, target))
	fmt.Println("")

	numbers = []int{2,7,11,15}
	target = 9
	fmt.Println(fmt.Sprintf("numbers--->: %v   \ntarget--->: %d", numbers, target))
	fmt.Println("方法一: ",sum1(numbers, target))
	fmt.Println("方法二: ", sum2(numbers, target))
	fmt.Println("")

	numbers = []int{2,3,4}
	target = 6
	fmt.Println(fmt.Sprintf("numbers--->: %v   \ntarget--->: %d", numbers, target))
	fmt.Println("方法一: ",sum1(numbers, target))
	fmt.Println("方法二: ", sum2(numbers, target))
	fmt.Println("")

	numbers = []int{-1, 0, 5, 7}
	target = 6
	fmt.Println(fmt.Sprintf("numbers--->: %v   \ntarget--->: %d", numbers, target))
	fmt.Println("方法一: ",sum1(numbers, target))
	fmt.Println("方法二: ", sum2(numbers, target))
	fmt.Println("")

	numbers = []int{-10, -8, -5, 5}
	target = -13
	fmt.Println(fmt.Sprintf("numbers--->: %v   \ntarget--->: %d", numbers, target))
	fmt.Println("方法一: ",sum1(numbers, target))
	fmt.Println("方法二: ", sum2(numbers, target))
	fmt.Println("")
}

/// 方法一: 循环遍历法 不推荐使用
func sum1(numbers []int, target int) []int {

	for x, num1 := range numbers {
		for y, num2 := range numbers {
			if num1 + num2 == target {
				return []int{x, y}
			}
		}
	}
	return nil
}

/*
方法二: 有个条件没有使用, 有序数组, x 首先指向首元素, y 指向末元素.
那其实如果 numbers[x] + numbers[y] < target, 则 x = x + 1, 继续循环
如果 numbers[x] + numbers[y] >  target, 则 y = y - 1, 继续循环
直至 numbers[x] + numbers[y] == target, return x, y
*/
func sum2(numbers []int, target int) []int {
	x := 0
	y := len(numbers) - 1
	for x < y {
		sum := numbers[x] + numbers[y]
		if sum == target {
			return []int{x, y}
		} else if sum < target {
			x += 1
		} else {
			y -= 1
		}
	}
	return nil
}