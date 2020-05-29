package per.xmx.designpattern.builder;

/**
 * @author xumaoxin
 * @since 2020/5/29 16:26:07
 */
public class Mainframe {
    private String mainBoard;
    private String cpu;
    private String power;
    private String memory;
    private String disk;
    private String gpu;

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getPower() {
        return power;
    }

    public String getMemory() {
        return memory;
    }

    public String getDisk() {
        return disk;
    }

    public String getGpu() {
        return gpu;
    }
}
