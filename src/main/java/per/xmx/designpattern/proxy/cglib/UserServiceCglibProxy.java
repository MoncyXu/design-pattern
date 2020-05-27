package per.xmx.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xumaoxin
 * @since 2020/5/27 17:37:55
 */
public class UserServiceCglibProxy implements MethodInterceptor {
    /**
     * 代理目标
     */
    private Object target;

    public UserServiceCglibProxy(Object target) {
        this.target = target;
    }

    // 给目标对象创建一个代理对象
    public Object getProxyInstance() {
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建子类代理
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("准备执行代理操作。。。");
        Object invoke = method.invoke(target, objects);
        System.out.println("代理执行完毕！");
        return invoke;
    }
}
