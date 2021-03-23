package main

import "fmt"

/*
给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。


示例：
二叉树：[3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层序遍历结果：

[
  [3],
  [9,20],
  [15,7]
]

*/

type TreeNode struct {
	Val int
	Left *TreeNode
	Right *TreeNode
}

var res = make([][]int, 0)

func levelOrder(root *TreeNode) [][]int {
	if root == nil {
		return res
	}
	helper(root, 0)
	return res
}

func helper(node *TreeNode, level int) {
	if len(res) == level {
		res = append(res, make([]int, 0))
	}
	res[level] = append(res[level], node.Val)

	if node.Left != nil {
		helper(node.Left, level + 1)
	}
	if node.Right != nil {
		helper(node.Right, level + 1)
	}
}