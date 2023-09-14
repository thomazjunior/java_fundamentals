package List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _LinkedList {
    /*
     * Linear Structure, where each element is not stored in contigous locations
     * The elements are linked usiging pointers and addresses -
     * ## LinkedList is indexed
     * ## Is not synchronized
     * ## Is fail-fast 
     * ## Each element is a node, which keeps a reference to the next and previous one
     */

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // add elements
        for (int i = 0; i < 10; ++i)
            ll.add(i + 1);
        ll.addFirst(2);
            ll.addFirst(1);
        System.out.println(ll);

        // changing elements
        ll.set(1, 10);
        System.out.println(ll);

        // remove elements
        ll.remove(2);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();


        // iterating the elements
        ll.iterator().forEachRemaining(item -> ll.remove(0)); // ConcurrentModificationException

        // LinkedList to Array
        Object[] a = ll.toArray();
        for (Object element : a)
            System.out.println(element);

        List list = Collections.synchronizedList(new LinkedList<Integer>());
    }
}
