package com.leetcode.weekly119;

import com.leetcode.leetcodeutils.PrintUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author BaoZhou
 * @date 2019/1/13
 */

public class KClosest {

    @Test
    public void test() {
        int[][] nums = new int[][]{{3, 2}, {4, 1}, {2, 1}, {4, 9}};

        PrintUtils.printMatrix(kClosest(nums, 2));
    }

    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(i -> (i[0] * i[0] + i[1] * i[1])));
        int[][] results = new int[K][2];
        System.arraycopy(points, 0, results,0, K);
        return results;
    }

}
