package cnm.Integer;
/*
*   该字符串必须由数字组成
*
* */
public class IntergerDemo2 {
    public static void main(String[] args) {
        //方式1
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println(ii);

        //方式2
        String s = "100";
        Integer iii = new Integer(s);
        System.out.println(iii);
    }
}
