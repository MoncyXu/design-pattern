package per.xmx.designpattern.facotry;

/**
 * @author xumaoxin
 * @since 2020/5/29 14:13:12
 */
public class XiaoMi implements Phone {
    @Override
    public void produce() {
        System.out.println("Producing XiaoMi phone...");
    }
}
