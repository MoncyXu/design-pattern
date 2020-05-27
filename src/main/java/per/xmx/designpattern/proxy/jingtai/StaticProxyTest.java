package per.xmx.designpattern.proxy.jingtai;

/**
 * 总结：
 * 静态代理模式在不改变目标对象的前提下，实现了对目标对象的功能扩展。
 * 不足：静态代理实现了目标对象的所有方法，一旦目标接口增加方法，代理对象和目标对象都要进行相应的修改，增加维护成本。
 *
 * @author xumaoxin
 * @since 2020/5/27 16:16:14
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.say();
        System.out.println("--------------------");
        proxy.run();
        System.out.println("--------------------");
        proxy.eat();
    }
}
