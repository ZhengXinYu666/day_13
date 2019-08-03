package cnm.Integer;

public class IntegerDemo4 {
    public static void main(String[] args) {
        //十进制到二进制，八进制，十六进制
        //转成其他进制
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,16));
        System.out.println(Integer.toString(100,5));
        System.out.println(Integer.toString(100,7));
        //进制不可以为负
        //由这个可以看到进制的范围
        //2-36  为什么呢？
        //因为0-9 a-z总共加起来36个
        System.out.println("-------------------------");
        //其他进制到10进制
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",2));
//        System.out.println(Integer.parseInt("123",2));
    }
}
