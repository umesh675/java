package javapractice.generic.stack;

import java.util.LinkedList;

public class Stack <T>{

    private LinkedList<T> list;

    public Stack(){
        list = new LinkedList<>();

    }

    public void push(T element){

        this.list.add(element);
    }

    public int size(){
        return this.list.size();
    }

    public T pop() throws Exception {

        if(this.size() == 0){
            throw new Exception("Stack size is zero");
        }

        T val = this.list.remove(this.size()-1);
        return  val;
    }

    public T peek() throws Exception{

        if(this.size() == 0){
            throw new Exception("Stack size is zero");
        }

        return this.list.get(this.size()-1);
    }

}
