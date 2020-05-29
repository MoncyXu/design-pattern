package per.xmx.designpattern.builder;

/**
 * @author xumaoxin
 * @since 2020/5/29 16:34:42
 */
public class MainframeBuilder extends MainframeAbstract {
    @Override
    public void buildCpu() {
        mainframe.setCpu("i9-9900K");
    }

    @Override
    public void buildMainBoard() {
        mainframe.setMainBoard("ASUS B350");
    }

    @Override
    public void buildMemory() {
        mainframe.setMemory("Kingston 3700MHz 16GB");
    }

    @Override
    public void buildPower() {
        mainframe.setPower("GreatWall 500W");
    }

    @Override
    public void buildGpu() {
    mainframe.setGpu("ASUS GTX 2080Ti");
    }

    @Override
    public void buildDisk() {
        mainframe.setDisk("WD SSD 1TB");
    }
}
