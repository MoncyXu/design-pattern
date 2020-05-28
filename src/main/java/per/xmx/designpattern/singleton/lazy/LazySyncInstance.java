package per.xmx.designpattern.singleton.lazy;

/**
 * 懒汉模式（懒加载、线程安全）
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 *
 * @author xumaoxin
 * @since 2020/5/28 11:25:41
 */
public final class LazySyncInstance {
    public static LazySyncInstance INSTANCE = null;

    private LazySyncInstance(){}

    public synchronized static final LazySyncInstance getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySyncInstance();
        }
        return INSTANCE;
    }
}
