package per.xmx.designpattern.singleton.lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 采用多线程测试懒汉模式
 *
 * @author xumaoxin
 * @since 2020/5/28 11:04:53
 */
public class LazyInstanceTest {
    public static void main(String[] args) {
        LazyInstance ins1 = LazyInstance.getInstance();
        LazyInstance ins2 = LazyInstance.getInstance();
        System.out.println(ins1 == ins2);

        ExecutorService executorService = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + finalI + " : " + LazyInstance.getInstance());
            });
        }
        executorService.shutdown();
    }
}
