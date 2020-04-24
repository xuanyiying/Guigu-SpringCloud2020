import java.util.Arrays;

/**
 * @author xuanyiying
 * Created on 2020/3/9  23:04
 */
public class Solution {
    /**
     * 返回两次操作后，数组元素之和的最小值
     *
     * @param nums int整型一维数组 这你你需要操作的数组
     * @return long长整型
     */
    public static void minimumValueAfterDispel(int[] nums) {
        // write code here
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= nums[1]) {
                nums[i] = nums[i] - nums[1];
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        minimumValueAfterDispel(nums);
    }
}