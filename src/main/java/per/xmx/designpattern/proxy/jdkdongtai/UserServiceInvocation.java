package per.xmx.designpattern.proxy.jdkdongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xumaoxin
 * @since 2020/5/27 16:51:44
 */
public class UserServiceInvocation implements InvocationHandler {
    /**
     * 代理目标
     */
    private Object target;

    public UserServiceInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备调用...");
        Object invoke = method.invoke(target, args);
        System.out.println("调用完成...");
        return invoke;
    }
}
