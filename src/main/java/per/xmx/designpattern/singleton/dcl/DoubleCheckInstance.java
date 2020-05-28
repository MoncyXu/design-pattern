package per.xmx.designpattern.singleton.dcl;

/**
 * 双检锁模式
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author xumaoxin
 * @since 2020/5/28 14:28:08
 */
public final class DoubleCheckInstance {
    private volatile static DoubleCheckInstance INSTANCE;

    private DoubleCheckInstance() {
    }

    public static DoubleCheckInstance getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckInstance.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckInstance();
                }
            }
        }
        return INSTANCE;
    }
}
