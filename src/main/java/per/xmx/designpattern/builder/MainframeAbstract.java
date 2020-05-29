package per.xmx.designpattern.builder;

/**
 * @author xumaoxin
 * @since 2020/5/29 16:30:51
 */
public abstract class MainframeAbstract {
    Mainframe mainframe = new Mainframe();

    public abstract void buildCpu();

    public abstract void buildMainBoard();

    public abstract void buildMemory();

    public abstract void buildPower();

    public abstract void buildGpu();

    public abstract void buildDisk();

    public Mainframe build() {
        return mainframe;
    }
}
