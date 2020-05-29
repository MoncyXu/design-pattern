package per.xmx.designpattern.facotry.chouxiang;

import per.xmx.designpattern.facotry.method.Phone;
import per.xmx.designpattern.facotry.method.XiaoMi;

/**
 * @author xumaoxin
 * @since 2020/5/29 15:45:38
 */
public class SCFactory implements MyFactory {
    @Override
    public Phone producePhone() {
        return new XiaoMi();
    }

    @Override
    public PersonalComputer produceComputer() {
        return new Lenovo();
    }
}
