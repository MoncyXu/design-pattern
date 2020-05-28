package per.xmx.designpattern.singleton.hungry;

/**
 * 饿汉模式（非懒加载、线程安全）
 * 这种方式比较常用，但容易产生垃圾对象。
 * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
 *
 * @author xumaoxin
 * @since 2020/5/28 11:30:58
 */
public final class HungryInstance {
    private static final HungryInstance INSTANCE = new HungryInstance();

    private HungryInstance() {
    }

    public static HungryInstance getInstance() {
        return INSTANCE;
    }
}
