import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
//        System.out.println(list);
        //Printing the arraylist object
        List<String> list2 = new LinkedList<String>();//Creating arraylist
        list2.add("James");//adding object in linkedlist
        list2.add("Serena");
        list2.add("Swati");
        list2.add("Junaid");
        System.out.println("arraylist: "+list);
        System.out.println("linkedlist: "+list2);

    }
}
