package per.xmx.designpattern.facotry.method;

/**
 * @author xumaoxin
 * @since 2020/5/29 14:16:41
 */
public class PhoneFactory {
    public static Phone makePhone(PhoneEnum phoneEnum) {
        switch (phoneEnum) {
            case HUAWEI:
                return new HuaWei();
            case XIAOMI:
                return new XiaoMi();
            case VIVO:
                return new Vivo();
            default:
                return null;
        }
    }
}