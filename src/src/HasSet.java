import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
    public static void main(String args[]){
//        HashSet<Integer> set=new HashSet<>(6,5.3f);
//        set.add(1);
//        set.add(8);
//        set.add(9);
//        set.add(12);
//        set.add(13);
//        set.add(14);
//        set.add(14);
//        System.out.println(set);
        HashSet<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String>st=set.iterator();
        while (st.hasNext()){
            System.out.println(st.next());
        }


    }
}
