import java.util.*;

public class Vector {
    public static void main(String[] args) {
        Vector<String> v2 = new Vector<String>();
        v2.add("Akash");
        v2.add("Sanjay");
        v2.add("Shivam");
        v2.add("Shruti");
        v2.add("Shika");
        Enumerator<String> en = v2.elements();
        while (en.hasMoreElements()) {
            String x = en.nextElement();
            System.out.println("======>" + x);
        }
    }
}
