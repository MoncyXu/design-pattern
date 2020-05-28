package per.xmx.designpattern.singleton.enums;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xumaoxin
 * @since 2020/5/28 17:35:48
 */
public class EnumInstanceTest {
    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.INSTANCE;
        EnumInstance instance1 = EnumInstance.INSTANCE;
        System.out.println(instance.equals(instance1));
        System.out.println(instance == instance1);
        EnumInstance.INSTANCE.anyMethod();

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                System.out.println(EnumInstance.INSTANCE);
            });
        }
        executorService.shutdown();
    }
}
