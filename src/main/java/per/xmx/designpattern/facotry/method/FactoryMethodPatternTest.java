package per.xmx.designpattern.facotry.method;

/**
 * @author xumaoxin
 * @since 2020/5/29 14:18:03
 */
public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        PhoneFactory.makePhone(PhoneEnum.HUAWEI).produce();
        PhoneFactory.makePhone(PhoneEnum.XIAOMI).produce();
        PhoneFactory.makePhone(PhoneEnum.VIVO).produce();
    }
}
