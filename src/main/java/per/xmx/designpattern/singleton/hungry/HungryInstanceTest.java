package per.xmx.designpattern.singleton.hungry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 饿汉模式测试
 *
 * @author xumaoxin
 * @since 2020/5/28 11:44:18
 */
public class HungryInstanceTest {
    public static void main(String[] args) {
        HungryInstance instance1 = HungryInstance.getInstance();
        HungryInstance instance2 = HungryInstance.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance2));

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + finalI + " : " + HungryInstance.getInstance());
            });
        }
        executorService.shutdown();
    }
}
