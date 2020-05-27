package per.xmx.designpattern.proxy.jdkdongtai;

import java.lang.reflect.Proxy;

/**
 * @author xumaoxin
 * @since 2020/5/27 16:58:23
 */
public class UserServiceJDKProxy {
    private Object target;
    private UserServiceInvocation invocation;

    public UserServiceJDKProxy(Object target, UserServiceInvocation invocation) {
        this.target = target;
        this.invocation = invocation;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
    }
}
