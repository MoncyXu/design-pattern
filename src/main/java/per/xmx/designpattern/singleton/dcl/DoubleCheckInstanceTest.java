package per.xmx.designpattern.singleton.dcl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 双检锁测试
 *
 * @author xumaoxin
 * @since 2020/5/28 14:38:10
 */
public class DoubleCheckInstanceTest {
    public static void main(String[] args) {
        DoubleCheckInstance ins1 = DoubleCheckInstance.getInstance();
        DoubleCheckInstance ins2 = DoubleCheckInstance.getInstance();
        System.out.println(ins1.equals(ins2));
        System.out.println(ins1 == ins2);

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + finalI + " : " + DoubleCheckInstance.getInstance());
            });
        }
        executorService.shutdown();
    }
}
