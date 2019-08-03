package cnm.test;
/*
*   选择排序：
*       从0索引开始，依次和后面的元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
*
* */
public class SelectionSort {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前：");
        printArray(arr);
        System.out.println("排序后");
        selectionSort(arr);
        printArray(arr);
    }

    //选择排序
    public static void selectionSort(int []arr){
        for(int x = 0;x<arr.length-1;x++){
            for(int y=x+1 ;y<arr.length;y++){
                if(arr[y]<arr[x]){
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }





    //遍历功能
    public static void printArray ( int[] arr){
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }
}
