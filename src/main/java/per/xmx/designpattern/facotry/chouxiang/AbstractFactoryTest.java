package per.xmx.designpattern.facotry.chouxiang;

/**
 * @author xumaoxin
 * @since 2020/5/29 15:46:28
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MyFactory factory1 = new CQFactory();
        factory1.producePhone().produce();
        factory1.produceComputer().produce();

        MyFactory factory2 = new SCFactory();
        factory2.produceComputer().produce();
        factory2.producePhone().produce();
    }
}
