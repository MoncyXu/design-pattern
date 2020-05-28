# 代理模式
## 静态代理
静态代理模式在不改变目标对象的前提下，实现了对目标对象的功能扩展。
不足：静态代理实现了目标对象的所有方法，一旦目标接口增加方法，代理对象和目标对象都要进行相应的修改，增加维护成本。
## JDK动态代理
为解决静态代理对象必须实现接口的所有方法的问题，Java给出了动态代理，动态代理具有如下特点：
 - Proxy对象不需要implements接口；
 - Proxy对象的生成利用JDK的Api，在JVM内存中动态的构建Proxy对象。需要使用java.lang.reflect.Proxy类的newProxyInstance方法。该方法
   参数说明如下：
   - a.ClassLoader loader 原型对象的类加载器
   - b.Class<?>[] interfaces 原型对象实现的接口
   - c.InvocationHandler h 自定义事件处理器
## CGLIB动态代理
JDK动态代理要求target对象是一个接口的实现对象，假如target对象只是一个单独的对象，并没有实现任何接口，这时候就会用到Cglib代理
(Code Generation Library)，即通过构建一个子类对象，从而实现对target对象的代理，因此目标对象不能是final类(报错)，且目标对象的方法
不能是final或static（不执行代理功能）。