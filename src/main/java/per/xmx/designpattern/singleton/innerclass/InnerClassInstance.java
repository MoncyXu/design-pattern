package per.xmx.designpattern.singleton.innerclass;

/**
 * 登记式/静态内部类
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程，它跟饿汉方式不同的是：饿汉方式只要 EnrollmentInstance
 * 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 EnrollmentInstance 类被装载了，instance 不
 * 一定被初始化。因为 EnrollmentHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 EnrollmentHolder 类，
 * 从而实例化instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 EnrollmentInstance 类
 * 加载时就实例化，因为不能确保 EnrollmentInstance 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适
 * 的。这个时候，这种方式相比饿汉方式就显得很合理。
 *
 * @author xumaoxin
 * @since 2020/5/28 16:58:11
 */
public final class InnerClassInstance {
    private static final class EnrollmentHolder {
        private static final InnerClassInstance INSTANCE = new InnerClassInstance();
    }

    private InnerClassInstance() {
    }

    public static InnerClassInstance getInstance() {
        return EnrollmentHolder.INSTANCE;
    }
}
