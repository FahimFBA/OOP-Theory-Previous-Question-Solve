import java.util.*;
class Tricky {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("C" );
        list.add(null);
        list.add("A" );
        list.add(null);
        System.out.println("ArrayList: " + list);
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "A" );
        hm.put(2, "B" );
        hm.put(null, "C" );
        hm.put(null, null);
        hm.put(3, null);
        System.out.println(" HasMap: " + hm);
    }
}