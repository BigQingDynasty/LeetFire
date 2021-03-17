package main

import "fmt"

/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

示例 1：
输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
1 2 3
4 5 6
7 8 9
输出：[1,2,3,6,9,8,7,4,5]

示例 2：
输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
1  2  3  4
5  6  7  8
9  10 11 12
输出：[1,2,3,4,8,12,11,10,9,5,6,7]
*/

func main() {

	r := [][]int{{1,2,3}, {4,5,6}, {7,8,9}}
	fmt.Println("result--->: ", spiralOrder(r))

	/*
	1  2  3  4
	5  6  7  8
	9  10 11 12
	*/
	r = [][]int{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}
	fmt.Println("result--->: ", spiralOrder(r))

	/*
	1  2  3
	4  5  6
	7  8  9
	10 11 12
	*/
	r = [][]int{{1,2,3}, {4,5,6}, {7,8,9},{10,11,12}}
	fmt.Println("result--->: ", spiralOrder(r))
}

func spiralOrder(matrix [][]int) []int {

	res := make([]int, 0)
	if len(matrix) == 0 {
		return res
	}
	/*
	1 2 3
	4 5 6
	7 8 9
	*/
	left := 0					/// 左边界
	right := len(matrix[0]) - 1	/// 右边界
	top := 0					/// 上边界
	bottom := len(matrix) - 1 	/// 下边界

	for {
		/// left -> right
		for i := left; i <= right; i++ {
			res = append(res, matrix[top][i])
		}
		top += 1			/// left -> right 后, top 部分已经走完了, 所以需要 +1.
		if top > bottom {
			break
		}

		/// top -> bottom
		for i := top; i <= bottom; i++ {
			res = append(res, matrix[i][right])
		}
		right = right - 1			/// top -> bottom 后, right 部分已经走完了, 所以需要 -1.
		if right < left {
			break
		}

		/// right -> left
		for i := right; i >= left; i-- {
			res = append(res, matrix[bottom][i])
		}
		bottom = bottom - 1			/// right -> left 后, bottom 部分已经走完了, 需要 -1.
		if bottom < top {
			break
		}

		/// bottom -> top
		for i := bottom; i >= top; i-- {
			res = append(res, matrix[i][left])
		}
		left += 1					/// bottom -> top 后, left 部分已经走完了, 需要 +1.
		if left > right {
			break
		}
	}
	return res
}
