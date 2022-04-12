package assignment.assignment7.part1;

public abstract class Rodent {

    private double size;
    private String color;

    public Rodent(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void print();
}
