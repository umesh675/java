package assignment.assignment7.part2;

public class Main {

    public static void main(String[] args) {

        Cycle cycle[] = new Cycle[3];

        //Upcasting
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();

        //cycle[0].balance();  //in upcasting we can not access child class method

        //down casting
        Unicycle obj = (Unicycle) cycle[0];
        obj.balance();
    }
}
