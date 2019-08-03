package cnm.Integer;
/*
*   需求1：把100这个数据的二进制 八进制 十六进制计算出来
*   需求2：判断一个数据是否是int范围内的
*         首先int的范围为多少？
*           2^31-1
*
*   为了使对基本数据操作更方便，引入包装类
*   byte        Byte
*   short       Short
*   long        Long
*   int         Interger
*   float       Float
*   double      Double
*   char        Character
*   boolean     Boolean
* */
public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println("二进制："+Integer.toBinaryString(100));
        System.out.println("八进制："+Integer.toOctalString(100));
        System.out.println("十六进制："+Integer.toHexString(100));

        System.out.println("最大值是："+Integer.MAX_VALUE);
        System.out.println("最小值是："+Integer.MIN_VALUE);
    }
}
