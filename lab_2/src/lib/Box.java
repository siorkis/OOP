package lib;

public class Box {

    int height;
    int width;
    int depth;

    public Box() {
        height = width = depth = 1;
    }

    public Box(int value) {
        height = width = depth = value;
    }

    public Box(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        int area = 2 * (height * width) + 2 * (depth * width) + 2 * (height * depth);
        return area;
    }

    public int getVolume() {
        int volume = height * width * depth;
        return volume;
    }
}
