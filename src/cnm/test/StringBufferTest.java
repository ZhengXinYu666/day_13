package cnm.test;
/*
*   为什么讲解类之间的转换？
*   A--B的转换
*       把A转换为B其实是为了使用B的功能
*   B--A的转换
*       我们可能要的是A类型，所以还得转回来
* */
public class StringBufferTest {
    public static void main(String[] args) {
        String s = "hello";
        //不能把字符串的值直接赋值给StringBuffer
        //那么如何转换呢？
        //方式1：通过构造方法
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb);
        //方式2：通过append()方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println(sb2);
        //StringBuffer-----String?如何转换呢？
        StringBuffer buffer = new StringBuffer("java");


        //方式1：通过构造方法
        String str = new String(buffer);
        //方式2：通过toString()方法
        String str2 = buffer.toString();
        System.out.println(str);
        System.out.println(str2);
    }
}
 