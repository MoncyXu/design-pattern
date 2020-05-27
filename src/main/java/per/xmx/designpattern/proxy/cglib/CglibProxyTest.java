package per.xmx.designpattern.proxy.cglib;

/**
 * JDK动态代理要求target对象是一个接口的实现对象，假如target对象只是一个单独的对象，并没有实现任何接口，这时候就会用到Cglib代理
 * (Code Generation Library)，即通过构建一个子类对象，从而实现对target对象的代理，因此目标对象不能是final类(报错)，且目标对象的方法
 * 不能是final或static（不执行代理功能）。
 *
 * @author xumaoxin
 * @since 2020/5/27 17:42:00
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        UserCglibService userCglibService = new UserCglibService();
        UserServiceCglibProxy proxy = new UserServiceCglibProxy(userCglibService);
        UserCglibService proxyInstance = (UserCglibService) proxy.getProxyInstance();
        System.out.println("代理对象：" + proxyInstance.getClass());
        proxyInstance.run();
        proxyInstance.say();
    }
}
