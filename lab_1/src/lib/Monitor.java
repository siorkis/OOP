package lib;

public class Monitor {
    int monitorSize;
    String monitorColor;
    String monitorResolution;

    public Monitor(){

    }

    public void setSize(int size) {
        monitorSize = size;
    }

    public int getSize() {
        return monitorSize;
    }

    public void setColor(String color) {
        monitorColor = color;
    }

    public String getColor() {
        return monitorColor;
    }

    public void setResolution(String resolution) {
        monitorResolution = resolution;
    }

    public String getResolution() {
        return monitorResolution;
    }
}
