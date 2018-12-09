/**
 * @author: BaoZhou
 * @date : 2018/12/10 0:58
 */
public class stocktime {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        //int[] nums = {1, 1, 2};
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = maxProfit(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                result+=prices[i] -prices[i-1];
            }
        }
        return result;
    }
}

