package per.xmx.designpattern.proxy.jingtai;

/**
 * @author xumaoxin
 * @since 2020/5/27 16:07:24
 */
public class UserServiceImpl implements UserService {
    @Override
    public void say() {
        System.out.println("原型：我在说话呢。。。");
    }

    @Override
    public void run() {
        System.out.println("原型：我在跑呢。。。");
    }
}
