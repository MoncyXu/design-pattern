package per.xmx.designpattern.proxy.jingtai;

import per.xmx.designpattern.proxy.UserService;

/**
 * @author xumaoxin
 * @since 2020/5/27 16:14:04
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void say(String words) {
        System.out.println("代理：调用代理目标say(String)");
    }

    @Override
    public void say() {
        System.out.println("代理：调用代理目标say");
        userService.say();
    }

    @Override
    public void run() {
        System.out.println("代理：调用代理目标run");
        userService.run();
    }

    public void eat() {
        System.out.println("代理：我还会eat");
    }
}
