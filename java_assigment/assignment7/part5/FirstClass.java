package assignment.assignment7.part5;

public class FirstClass {

    //if we not use static and we inherit inner class then we get error
    //because we can not call inner class with class name directly
    static class InnerClass{

        public InnerClass(int val){
            System.out.println("Inner class parameter: "+val);
        }
    }
}
