package design;

import java.util.Random;

/**
 * Knuth-Durstenfeld Shuffle
 *
 * @author: BaoZhou
 * @date : 2018/12/18 16:19
 */
class Solution {

    int[] src;
    Random ran ;

    public Solution(int[] nums) {
        src = nums;
        ran = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return src;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] result = src.clone();
        int t ;
        for (int i = result.length - 1; i > 0; i--) {
            int x = ran.nextInt(i+1);
            t = result[i];
            result[i] = result[x];
            result[x] = t;
        }
        return result;
    }
}