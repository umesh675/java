package assignment.assignment7.part3;

public class ImplementClass extends ConcreteClass implements Interface4{
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }

    @Override
    public void method5() {
        System.out.println("method5");
    }

    @Override
    public void method6() {
        System.out.println("method6");
    }

    @Override
    public void method7() {
        System.out.println("method7");
    }

    public void interfaceMethod(Interface1 i){
        System.out.println("interface method");
    }
    public void interfaceMethod1(Interface2 i){
        System.out.println("interface2 method");
    }
    public void interfaceMethod2(Interface3 i){
        System.out.println("interface3 method");
    }
    public void interfaceMethod3(Interface4 i){
        System.out.println("interface4 method");
    }
}
