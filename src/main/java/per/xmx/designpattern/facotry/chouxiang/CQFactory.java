package per.xmx.designpattern.facotry.chouxiang;

import per.xmx.designpattern.facotry.method.HuaWei;
import per.xmx.designpattern.facotry.method.Phone;

/**
 * @author xumaoxin
 * @since 2020/5/29 15:42:01
 */
public class CQFactory implements MyFactory {

    @Override
    public Phone producePhone() {
        return new HuaWei();
    }

    @Override
    public PersonalComputer produceComputer() {
        return new Asus();
    }
}
