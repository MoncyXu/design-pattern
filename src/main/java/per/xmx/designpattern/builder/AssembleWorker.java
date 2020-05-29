package per.xmx.designpattern.builder;

/**
 * @author xumaoxin
 * @since 2020/5/29 16:40:52
 */
public class AssembleWorker {
    private MainframeAbstract builder;

    public AssembleWorker(MainframeAbstract builder) {
        this.builder = builder;
    }

    public Mainframe assemble() {
        builder.buildCpu();
        builder.buildMainBoard();
        builder.buildMemory();
        builder.buildPower();
        builder.buildDisk();
        builder.buildGpu();
        return builder.build();
    }
}
