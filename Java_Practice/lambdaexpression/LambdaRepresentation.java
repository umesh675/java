package javapractice.lambdaexpression;


//only have one abstract method
interface FuncInterface{

    void abstractFun(int x);
   // void abc(String y);

    default void normalFun(){
        System.out.println("Functional Interface");
    }
}
public class LambdaRepresentation {

    public static void main(String[] args) {

        //way of representation (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
        FuncInterface fRef = (int x) -> System.out.println(2*x);


        fRef.abstractFun(5);
    }
}
