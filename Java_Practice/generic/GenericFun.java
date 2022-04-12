package javapractice.generic;

public class GenericFun {

    static <T> void display(T val)  {

        System.out.println(val.getClass()+" "+val);
    }

    public static void main(String[] args)  {


         display(10);
         display(10.5);
         display("Rahul");
    }
}
