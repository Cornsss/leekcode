package util;

public class ComparatorUtil {

    /**
     * 生成随机数组 （默认都是正整数）
     * @param maxSize 数组最大长度
     * @param maxValue 数组最大值
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random() -> [0,1)
        // Math.random()*N -> [0,N)
        // (int)Math.random()*N -> [0,N)范围上的整数
//        int[] result = new int[maxSize]; 不能这么初始化数组，因为长度也是随机的，长度的范围是[1,maxSize]范围上的整数值
        int randomSize = (int) ((maxSize + 1) * Math.random()); // [0, maxSize+1)范围随机整数
        int[] result = new int[randomSize];
        for (int i = 0; i < result.length; i++) {
            int randomValue = (int) (Math.random() * (maxValue+1)); // [0, maxValue+1)随机整数
            result[i] = randomValue;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = generateRandomArray(10, 100);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
