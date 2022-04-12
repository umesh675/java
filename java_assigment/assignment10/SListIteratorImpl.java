package assignment.assignment10;

public class SListIteratorImpl<T> implements SListIterator<T> {


    @Override
    public void add(SList sList, T data) {

        SList node = new SList(data);

        while (sList.getNext() != null){
            sList = sList.getNext();
        }
        sList.setNext(node);
    }

    @Override
    public void remove(SList sList) {

        if(sList.getNext() == null){
            System.out.println("Linked List empty");
            return;
        }

        while(sList.getNext().getNext() != null){
             sList = sList.getNext();
        }
        sList.setNext(null);
    }

    @Override
    public void displayList(SList sList) {

        System.out.println("Linked List is: ");

        if(sList.getNext() == null){
            System.out.println("Linked List empty");
        }

        while (sList.getNext() != null){
            System.out.print(sList.getNext().getData()+" ");
            sList = sList.getNext();
        }
        System.out.println();
    }

}
