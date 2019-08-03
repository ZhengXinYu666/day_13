package cnm.Integer;
/*
*   int类型和String类型的转换
*       int----String
*       String---int
* */
public class IntegerDemo3 {
    public static void main(String[] args) {
        int number = 100;

        //方式1
        String s1 = ""+number;
        System.out.println("s1:"+s1);

        //方式2
        String s2 = String.valueOf(number);
        System.out.println("s2:"+s1);

        //方式3
        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:"+s3);

        //方式4
        //public static String toString(int i)
        String s4 = Integer.toString(number);
        System.out.println("s4:"+s4);

        //String---int
        String s = "100";
        Integer ii = new Integer(s);
        System.out.println("x:"+ii.intValue());

        int y = Integer.parseInt(s);
        System.out.println("y:"+y);
    }
}
