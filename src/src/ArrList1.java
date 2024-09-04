import java.util.*;
public class ArrList1 {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Mango");//Adding object in arraylist
            list.add("Apple");
            list.add("Banana");
            list.add("Grapes");
            //Printing the arraylist object
            System.out.println(list);
            list.remove("Banana");
            System.out.println(list);

//            Iterating ArrayList using Iterator
//            Iterator itr=list.iterator();
//            while (itr.hasNext()){
//                System.out.println(itr.next());
//            }
//            Iterating ArrayList using For-each loop
//            for(String str:list){
//                System.out.println(str);
//            }

//            Get and Set ArrayList
//            System.out.println(list.get(2));
            list.set(1,"Papita");
            for(String str:list){
                System.out.println(str);
            }
            List<Integer> list2=new ArrayList<Integer>();
            list2.add(21);
            list2.add(11);
            list2.add(51);
            list2.add(1);
            Collections.sort(list2);
            for(int str:list2){
                System.out.println(str);
            }
            //Removing specific element from arraylist
            list2.remove(1);
            System.out.println(list2);
            List<String> list3=new ArrayList<String>();
            //Adding new elements to arraylist
            list3.add("Ravi");
            list3.add("Hanumat");
            //Adding new elements to arraylist
            list.addAll(list3);
           System.out.println("Updated list"+list);
            //Removing all the new elements from arraylist
            list.removeAll(list3);
            System.out.println("After invoking removeAll() method:"+list);

            //Removing elements on the basis of specified condition
//            list.removelf(str->str.contains("Ajay"));
//            list.clear();
//            System.out.println("After invoking clear() method: "+list);
//            Java ArrayList example of retainAll() method
            list.retainAll((list3));
            System.out.println("iterating the elements after retaining the elements of al2");
            Iterator itr=list.iterator();
            while (itr.hasNext()){
                System.out.println(itr.hasNext());
            }

        }
    }
