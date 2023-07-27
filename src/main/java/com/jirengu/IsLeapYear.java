package com.jirengu;

public class IsLeapYear {

    public static void main(String[] args) {
        System.out.println(IsLeapYear.isLeapYear(1900));
    }

    public static boolean isLeapYear(int year) {
        // 这个方法接收一个整数参数（年份），返回一个布尔值（是否为闰年）
        // 修改代码，根据输入的年份判断它是否为闰年
        // 闰年的规则如下：
        // 1. 任何能被4整除的且不是100的倍数年份通常是一个闰年
        // 2. 特殊情况：能被100整除而不能被400整除的年份不是闰年
        // 提示：利用条件和逻辑运算符实现这个稍微复杂的逻辑判断
        // 整除 = 取余
        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
                return true;
        }
        return  false;
    }
}
