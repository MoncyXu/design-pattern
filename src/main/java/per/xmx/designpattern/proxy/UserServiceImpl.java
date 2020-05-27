package per.xmx.designpattern.proxy;

/**
 * @author xumaoxin
 * @since 2020/5/27 16:07:24
 */
public class UserServiceImpl implements UserService {
    @Override
    public void say(String words) {
        System.out.println("代理目标：" + words);
    }

    @Override
    public void say() {
        System.out.println("代理目标：我在说话呢。。。");
    }

    @Override
    public void run() {
        System.out.println("代理目标：我在跑呢。。。");
    }
}
