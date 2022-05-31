package zuochengyun.lesson02;

/**
 * 二分查找法
 *
 * 时间复杂度：O(logN)
 *
 * 1. 查找数组范围上是否存在某个数
 * 2. 查找数组范围上>=N的最左侧的下标
 * 3. 局部最小值问题：如果存在一个数的左右两侧都比该数大，则该数即为局部最小值
 */
public class Code02MiddleSearch {

    public static void main(String[] args) {
        int[] arr1 = {2,5,6,9,11,13,20};
        System.out.println("二分法查找目标值的位置下标: " + middleSearch(arr1, 7));
        int[] arr2 = {16,7,11,9,7,6,5,8};
        System.out.println("局部最小值: " + findRangeSmallest(arr2));
    }

    public static int middleSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left < right) {
//            mid = (left + right) / 2; 这里可能出现溢出的情况，所以进行以下优化
            mid = left + ((right - left) >> 1);
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        if (left == right) {
            mid = -1;
        }
        return mid;
    }

    public static int findLeft(int[] arr, int target) {
        return 0;
    }


    public static int findRangeSmallest(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        // 数组长度判断
        if (arr != null && arr.length < 2) {
            return -1;
        }
        // 边界值判断
        if (arr[0] < arr[1]) {
            return arr[0];
        }
        if (arr[right] < arr[right-1]) {
            return arr[right];
        }
        while (left < right) {
            mid = left +((right - left) >> 1);
            if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) {
                return arr[mid];
            } else if (arr[mid] > arr[mid-1]) {
                left = mid + 1;
            } else if (arr[mid] < arr[mid-1]) {
                right = mid - 1;
            }
        }
        if (left == right) {
            mid = -1;
        }
        return mid;
    }
}
