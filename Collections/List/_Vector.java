package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class _Vector {
    // synchronization - Vector is synchronized, ArrayList dont
    // size growth - Vector doubles its size, ArrayList increases only by half of
    // its size
    // iteration - Vector can use Iterator and Enumeration, ArrayList just Iterator
    // perfomance - due to syncrhonization, Vector is slower
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("baeldung");
        vector.add("Vector");
        vector.add("example");

        Iterator<String> iterator = vector.iterator();
        System.out.println("Iterating using iterator");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        Enumeration<String> enumeration = vector.elements();
        System.out.println("Iterating using enumeration");
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }

    }

}
