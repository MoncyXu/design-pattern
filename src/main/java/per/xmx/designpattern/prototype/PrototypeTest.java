package per.xmx.designpattern.prototype;

import com.alibaba.fastjson.JSON;

/**
 * @author xumaoxin
 * @since 2020/5/29 09:06:49
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        shallowTest();
        System.out.println("\n============分割线============\n");
        deepTest();
    }

    private static void shallowTest() throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setName("李四");
        shallowClone.setPhone("986758885");
        shallowClone.setAddress("重庆");
        shallowClone.setObj(new Object());
        shallowClone.setNum(1);
        System.out.println("本体：" + shallowClone + "，数据：" + JSON.toJSONString(shallowClone));

        ShallowClone clone = shallowClone.clone();
        System.out.println(shallowClone.getObj());
        System.out.println(clone.getObj());
        System.out.println("本体和克隆体equal？" + shallowClone.equals(clone));
        System.out.println("修改age...");
        clone.setNum(2);
        System.out.println("克隆体：" + clone + "，数据：" + JSON.toJSONString(clone));
        System.out.println("本体：" + shallowClone + "，数据：" + JSON.toJSONString(shallowClone));
    }

    private static void deepTest() throws CloneNotSupportedException {
        DeepClone deepClone = new DeepClone();
        deepClone.setName("李四");
        deepClone.setPhone("986758885");
        deepClone.setAge(88);
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setName("shallow");
        shallowClone.setAddress("none");
        deepClone.setShallowClone(shallowClone);
        System.out.println("本体：" + deepClone + "，数据：" + JSON.toJSONString(deepClone));

        DeepClone clone = deepClone.clone();
        System.out.println(deepClone.getShallowClone());
        System.out.println(clone.getShallowClone());
        System.out.println("本体和克隆体equal？" + deepClone.equals(clone));
        System.out.println("修改age...");
        clone.setAge(555);
        System.out.println("克隆体：" + clone + "，数据：" + JSON.toJSONString(clone));
        System.out.println("本体：" + deepClone + "，数据：" + JSON.toJSONString(deepClone));
    }
}
