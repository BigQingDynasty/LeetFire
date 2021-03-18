package main

import "fmt"

/*

给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。

输入：n = 3
输出：[[1,2,3],[8,9,4],[7,6,5]]
1 2 3
8 9 4
7 6 5
*/

func main() {

	/*
	[[1 2 3] [8 9 4] [7 6 5]]
	1  2  3
	8  9  4
	7  6  5
	*/
	fmt.Println(generateMatrix(3))

	/*
	[[1 2 3 4] [12 13 14 5] [11 16 15 6] [10 9 8 7]]
	1  2  3  4
	12 13 14 5
	11 16 15 6
	10 9  8  7
	*/
	fmt.Println(generateMatrix(4))
}

/*
思路: 将矩阵分成 n 层, 从外向内顺时针依次填充, 过程中控制 l r t b 的变化.
和 29 题相似.
*/
func generateMatrix(n int) [][]int {

	/// 初始化 [[],[],[]]
	matrix := make([][]int, n)
	for i := range matrix {
		matrix[i] = make([]int, n)
	}

	num := 1
	/// 初始化四个临界值
	left := 0
	right := len(matrix[0]) - 1
	top := 0
	bottom := len(matrix) - 1

	for left <= right && top <= bottom {
		for i := left; i <= right; i++ {
			matrix[top][i] = num
			num++
		}
		for i := top + 1; i <= bottom; i++ {
			matrix[i][right] = num
			num++
		}
		if left < right && top < bottom {
			for i := right - 1; i > left; i-- {
				matrix[bottom][i] = num
				num++
			}
			for i := bottom; i > top; i-- {
				matrix[i][left] = num
				num++
			}
		}
		left++
		right--
		top++
		bottom--
	}

	return matrix
}