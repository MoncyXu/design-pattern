package per.xmx.designpattern.facotry.chouxiang;

import per.xmx.designpattern.facotry.method.Phone;

/**
 * @author xumaoxin
 * @since 2020/5/29 15:24:49
 */
public interface MyFactory {
    Phone producePhone();
    PersonalComputer produceComputer();
}
