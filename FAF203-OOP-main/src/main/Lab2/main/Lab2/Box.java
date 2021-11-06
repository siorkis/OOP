package main.Lab2;

public class Box {

    public int height;
    public int width;
    public int depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(Integer same) {
        this.height = same;
        this.width = same;
        this.depth = same;
    }

    public Box(Integer height, Integer width, Integer depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return  "+---------+" + "\n" +
                "Height: " + this.height + "\n" +
                "Width: " + this.width + "\n" +
                "Depth: " + this.depth;
    }

    public Integer Area() {
        return 2 * (this.width * this.height + this.width * this.depth + this.height * this.depth);
    }

    public Integer Volume() {
        return this.depth * this.width * this.height;
    }

}
