package main

import "fmt"

/*
给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。

输入为三个整数：day、month 和year，分别表示日、月、年。

您返回的结果必须是这几个值中的一个"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。


示例 1：

输入：day = 31, month = 8, year = 2019
输出："Saturday"
示例 2：

输入：day = 18, month = 7, year = 1999
输出："Sunday"
示例 3：

输入：day = 15, month = 8, year = 1993
输出："Sunday"
*/

func main() {

	fmt.Println(isLeapYear(2000))
	fmt.Println(dayOfTheWeek(2021, 2,22))
	fmt.Println(dayOfTheWeek(1971, 1,1))
	fmt.Println(dayOfTheWeek(1995, 12,23))
}

func dayOfTheWeek(year, month, day int) string {
	// 1971年1月1日为星期五
	res := []string{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"}
	// 后续算时间需要减掉1天，故置为-1
	days := -1
	for i := 1971; i < year; i++ {
		if isLeapYear(i) {
			days += 366
		} else {
			days += 365
		}
	}

	for i := 1; i < month; i++ {
		switch i {
		case 2:
			if isLeapYear(year) {
				days += 29
			} else {
				days += 28
			}
		case 1, 3, 5, 7, 8, 10, 12:
			days += 31
		default:
			days += 30
		}
	}

	days += day
	return res[days % 7]
}

func isLeapYear(year int) bool {
	if (year % 4 == 0 && year % 100 != 0) || year % 400 == 0{
		return true
	}
	return false
}

