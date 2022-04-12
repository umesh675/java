package assignment.assignment7.part1;

public class Main {

    public static void main(String[] args) {

        Rodent rodent[] = new Rodent[2];
        rodent[0] = new Mouse(8.8,"grey");
        rodent[1] = new Gerbil(11,"brown");

        rodent[0].print();
        rodent[1].print();
    }
}
