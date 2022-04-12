package assignment.assignment7.part1;

public class Gerbil extends Rodent{

    public Gerbil(double size, String color) {
        super(size, color);
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getName()+" size: "+super.getSize()+" color: "+super.getColor());
    }
}
