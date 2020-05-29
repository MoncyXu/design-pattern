package per.xmx.designpattern.facotry;

/**
 * @author xumaoxin
 * @since 2020/5/29 14:15:38
 */
public class Vivo implements Phone {
    @Override
    public void produce() {
        System.out.println("Producing Vivo phone...");
    }
}
