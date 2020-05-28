package per.xmx.designpattern.singleton.innerclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 登记式/静态内部类测试
 *
 * @author xumaoxin
 * @since 2020/5/28 17:08:05
 */
public class InnerClassInstanceTest {
    public static void main(String[] args) {
        InnerClassInstance instance1 = InnerClassInstance.getInstance();
        InnerClassInstance instance2 = InnerClassInstance.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1 == instance2);

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                System.out.println(InnerClassInstance.getInstance());
            });
        }
        executorService.shutdown();
    }
}
