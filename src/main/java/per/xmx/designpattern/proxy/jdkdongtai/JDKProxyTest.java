package per.xmx.designpattern.proxy.jdkdongtai;

import per.xmx.designpattern.proxy.UserService;
import per.xmx.designpattern.proxy.UserServiceImpl;

/**
 * 为解决静态代理对象必须实现接口的所有方法的问题，Java给出了动态代理，动态代理具有如下特点：
 * 1.Proxy对象不需要implements接口；
 * 2.Proxy对象的生成利用JDK的Api，在JVM内存中动态的构建Proxy对象。需要使用java.lang.reflect.Proxy类的newProxyInstance方法。该方法
 * 参数说明如下：
 *  a.ClassLoader loader 原型对象的类加载器
 *  b.Class<?> interfaces 原型对象实现的接口
 *  c.InvocationHandler h 自定义事件处理器
 *
 * @author xumaoxin
 * @since 2020/5/27 17:00:00
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceInvocation invocation = new UserServiceInvocation(userService);
        UserService proxy = (UserService) new UserServiceJDKProxy(userService, invocation).getProxy();
        System.out.println("代理对象：" + proxy.getClass());
        proxy.say("瞎扒拉两句");
        proxy.run();
        System.out.println();
    }
}
