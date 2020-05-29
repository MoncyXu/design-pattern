package per.xmx.designpattern.builder;

import com.alibaba.fastjson.JSON;

/**
 * @author xumaoxin
 * @since 2020/5/29 16:44:51
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        MainframeAbstract builder = new MainframeBuilder();
        AssembleWorker assembleWorker = new AssembleWorker(builder);
        Mainframe mainframe = assembleWorker.assemble();
        System.out.println(JSON.toJSONString(mainframe));
    }
}
