package cnm.test;
/*
*   二分查找
* */
public class BinarySearch {
    public static void main(String[] args) {
        //定义最大索引，最小索引
        int[] arr = {11,22,33,44,55,66,77};
        int index = getIndex(arr,33);
        System.out.println("index="+ index);
    //假如这个元素不存在，会怎么样呢？
        index = getIndex(arr,333);
        System.out.println("index="+index);
    }
    //二分查找
    //明确返回值类型：int    参数列表 int[] arr,int value
    public static int getIndex(int[] arr,int value){
        //定义最大索引，最小索引
        int max = arr.length-1;
        int min = 0;
        //计算中间索引
        int mid = (max+min)/2;
        //拿中间索引的值和要查找的值进行比较
        while(arr[mid] != value){
            if(arr[mid] > value){
                max = mid-1;
            }else if(arr[mid] < value){
                 min = mid+1;
            }
            //加入判断
            if(min > max){
                return -1;
            }
            mid = (max+min)/2;
        }

        return mid;

        //重新计算中间索引

        //反复查找直到找到并输出

    }
}
