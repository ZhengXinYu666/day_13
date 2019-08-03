package cnm.test;

public class BubbleSort_final {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序之前：");
        printArray(arr);
//        for(int x = 0; x< arr.length-1;x++){
//            for(int y = 0; y<arr.length-1-x;y++){
//                if(arr[y]>arr[y+1]){
//                    int temp = arr[y];
//                    arr[y] = arr[y+1];
//                    arr[y+1] = temp;
//                }
//            }
//        }
//        System.out.println("排序后：");
//        printArray(arr);

        //由于可能有多个数组要排序，写成方法
        bubbleSort(arr);
        System.out.println("排序后");
        printArray(arr);
    }
    //冒泡排序方法
    public static void bubbleSort(int arr[]){
        for(int x = 0; x< arr.length-1;x++){
            for(int y = 0; y<arr.length-1-x;y++){
                if(arr[y]>arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
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