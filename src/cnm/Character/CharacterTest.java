package cnm.Character;
/*
*   统计一个字符串中大写字母，小写字母，数字出现的次数（不考虑其他字符）
*
*   分析：
*       A、定义三个统计变量
*           bigCount smallCount numberCount = 0
*       B、键盘录入一个字符串
*       C、把字符串转为字符数组
*       D、遍历字符数组获取到每一个字符
*       E、判断该字符是大写，小写，数字
*           统计变量++
*       F、输出结果
*
* */

import java.util.*;

public class CharacterTest {
    public static void main(String[] args) {
        //A、定义三个统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //B、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        // C、把字符串转为字符数组
        char[] chs = line.toCharArray();

        //D、遍历字符数组获取到每一个字符
        for(int x = 0; x < chs.length; x++) {
            char ch = chs[x];
            //E、判断该字符是大写，小写，数字
            if (Character.isUpperCase(ch)) {
                bigCount++;
            } else if (Character.isLowerCase(ch)) {
                smallCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        System.out.println("大写字符"+bigCount+"个");
        System.out.println("小写字符"+smallCount+"个");
        System.out.println("数字字符"+numberCount+"个");
    }
}
