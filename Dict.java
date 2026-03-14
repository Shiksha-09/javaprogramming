import java.util.*;

public class Dict {
    public static void main(String[] args) {
        Dictionary<Integer, Integer> h = new Hashtable<Integer, Integer>();
        h.put(1, 1000);
        h.put(10, 5000);
        h.put(3, 6000);
        h.put(4, 9999);
        h.put(5, 15335);
        System.out.println(" " + h);
        System.out.println("Print Data of DIctionary Using Enumerator");
        Enumeration<Integer> e = h.keys();
        while (e.hasMoreElements()) {
            Integer k = e.nextElement();
            System.out.println("Keys is : " + k + "  Values : " + h.get(k));
        }
        Map<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        h.put(1, 1000);
        h1.put(10, 5000);
        h1.put(3, 6000);
        h1.put(4, 9999);
        h1.put(5, 15335);
        System.out.println("Print Map Data Using Inner Interface");
        for (Map.Entry<Integer, Integer> x : h1.entrySet()) {
            System.out.println("hgh ");
        }

    }

}