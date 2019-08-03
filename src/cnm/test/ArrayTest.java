package cnm.test;
/*
*   把字符串中的字符进行排序
*       举例："dacgebf"
*       结果："abcdefg"
*
*   分析：
*       1、定义一个字符串
*       2、把字符串转换为字符数组
*       3、把字符数组进行排序
*       4、把排序后的字符数组转成字符串
*       5、输出最后的字符串
* */
public class ArrayTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "dacgebf";
        //把字符串转换为字符数组
        char[] chs = s.toCharArray();
        //把字符数组进行排序
        bubbleSort(chs);
        //把排序后的字符数组转换为字符串
        String result = String.valueOf(chs);
        //输出最后的字符串
        System.out.println("result:"+result);
    }

    //冒泡排序
    public static void bubbleSort(char[] chs){
        for(int x = 0; x<chs.length-1;x++){
            for(int y = 0; y < chs.length-1-x;y++){
                if(chs[y]>chs[y+1]){
                    char temp = chs[y];
                    chs[y] = chs[y+1];
                    chs[y+1] = temp;
                }
            }
        }
    }
}
