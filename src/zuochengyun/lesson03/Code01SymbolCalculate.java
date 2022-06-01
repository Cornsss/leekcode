package zuochengyun.lesson03;

/**
 * 认识位运算、异或算法
 *
 * 1. 如何不用额外变量，交换两个数
 * 2. 在某数组中，有一种数出现了奇数次，其他数都出现了偶数次，找出并打印这种数
 * 3. 如何提取一个数二进制最右侧的1
 */
public class Code01SymbolCalculate {

    public static void main(String[] args) {
        int[] arr = {1,3,20};
        swap(arr,0,1);
        System.out.println(arr[0] + " , " + arr[1]);
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
