package cnm.test;
/*
*   线程安全（多线程讲解）
*   安全--同步---数据是安全的
*   不安全--不同步---效率高一些
*   安全和效率一直在困扰着我们
*   安全：医院，银行的网站
*   效率：新闻网站，论坛之类的
*
*   StringBuffer是线程安全的可变字符串
*
*
*   StringBuffer和String的区别？
*   前者长度和内容可变，后者不可变
*   前者进行字符串拼接，不会浪费太多的资源
*
*
*   SatringBuffer的构造方法
*
*   public StringBuffer():无参构造方法
*   public StringBuffer(int capacity):指定容量的字符串缓冲区
*   public StringBuffer(string str）：指定字符串内容的字符串缓冲区对象
*
*
*   StringBuff的方法
*       public int capacity()：返回当前容量
* */
public class StringBufferDemo {
    public static void main(String[] args) {
        //无参构造方法
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("-------------");
        //


        //指定容量的字符串缓冲区对象
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("-------------");

        //指定字符串内容的字符串缓冲区对象
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        System.out.println("-------------");

    }
}
