package assignment.assignment10;

public class SListDemo {

    public static void main(String[] args) {

        SList<Integer> list = new SList<>();

        SListIterator<Integer> sListIterator = new SListIteratorImpl<>();

        sListIterator.add(list,10);
        sListIterator.add(list,20);
        sListIterator.add(list,30);
        sListIterator.add(list,40);
        sListIterator.add(list,50);

        sListIterator.displayList(list);

        sListIterator.remove(list);

        sListIterator.displayList(list);
    }
}
