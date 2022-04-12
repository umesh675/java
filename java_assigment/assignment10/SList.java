package assignment.assignment10;


public class SList<T> {

    private T data;
    private SList next;


    public SList(){
        next = null;
    }

    public SList(T data ){
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SList getNext() {
        return this.next;
    }

    public void setNext(SList next) {
        this.next = next;
    }
}
