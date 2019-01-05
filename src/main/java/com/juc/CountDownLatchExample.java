package com.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 闭锁：在完成某些运算时，只有其他所有的运算全部完成，当前的运算才会继续执行
 * 相当于计数器
 *
 * @author BaoZhou
 * @date 2018/7/26
 */
public class CountDownLatchExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        final CountDownLatch latch = new CountDownLatch(10);

        long start = System.currentTimeMillis();

        LatchDemo demo = new LatchDemo(latch);
        for (int i = 0; i < 10; i++) {
            es.execute(demo);
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();

        long end = System.currentTimeMillis();
        System.out.println("总共用时:" + (end - start));
    }
}

class LatchDemo implements Runnable {
    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 0; i < 50000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } finally {
                latch.countDown();
            }
        }


    }
}
