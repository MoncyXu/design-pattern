package per.xmx.designpattern.proxy.cglib;

/**
 * @author xumaoxin
 * @since 2020/5/27 17:35:14
 */
public class UserCglibService {
    public void say() {
        System.out.println("我正在想说点啥。。。");
    }

    public String run() {
        System.out.println("在跑呢。。。");
        return "跑完了！";
    }
}
