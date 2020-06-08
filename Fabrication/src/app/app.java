package app;


import Fabrication7.Array;
import Fabrication7.Collection;
import Fabrication7.Iterator;
import Fabrication7.List;

public class app {
    public static void main(String[] arg) {
        List<Integer> l = new List<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        Array<String> a = new Array<String>(3);
        a.add("one");
        a.add("two");
        a.add("three");
        {
            Iterator<Integer> it = l.iterator(); // fabrication
            String s = "< ";
            while (it.hasNext())
                s += it.next() + " ";
            System.out.println(s + ">");
        }

        {
            Iterator<String> it = a.iterator(); // fabrication
            String s = "< ";
            while (it.hasNext())
                s += it.next() + " ";
            System.out.println(s + ">");
        }

        for (Collection<?> collection : new Collection<?>[]{l, a}) {
            Iterator<?> it = collection.iterator(); // fabrication
            String s = "< ";
            while (it.hasNext())
                s += it.next() + " ";
            System.out.println(s + ">");
        }
    }
}

