/**
 * @author: BaoZhou
 * @date : 2018/12/10 0:58
 */
public class rotate {

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        //int[] nums = {1, 1, 2};
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = nums.length;
        rotate(nums,2);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void rotate(int[] nums, int k) {

    }
}

