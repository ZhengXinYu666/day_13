package cnm.test;
/*
*   冒泡排序
*   相邻；两两比较，大的放后面，第一次完毕，最大值出现在最大索引处
* */
public class BubbleSort {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24,69,80,57,13};
        System.out.println("排序之前：");
        printArray(arr);

        //第一次比较
        //为了防止数据越界，每次都要减一
        for(int x = 0; x < arr.length-1; x++){
            if(arr[x]>arr[x+1]){
              int temp = arr[x];
              arr[x] = arr[x+1];
              arr[x+1] = temp;
            }
        }
        System.out.println("第一次比较后");
        printArray(arr);

        //第二次比较
        for(int x = 0; x<arr.length-1-1;x++){
            if(arr[x]>arr[x+1]){
                int temp = arr[x];
                arr[x] = arr[x+1];
                arr[x+1] = temp;
            }
        }
        System.out.println("第二次比较后");
        printArray(arr);
    }
    //遍历功能
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x = 0; x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }
}
