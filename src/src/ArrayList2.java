import java.util.ArrayList;
import java.util.*;
public class ArrayList2 {
    public static void main(String args[]){
        //Creating a List
//        List<String>list=new ArrayList<String>();
//    //Adding elements in the List
//       list.add("Mango");
//       list.add("Apple");
//       list.add("Banana");
//       list.add("Grapes");
//        //Iterating the List element using for-each loop
//        for (String ans:list){
//            System.out.println(ans);
//        }
        String arr[]={"Mango","Apple","Banana","Grapes"};
        System.out.println("Printing Array"+Arrays.toString(arr));
//        How to convert Array to List
        List<String>ans=new ArrayList<String>();
        for (String l1:arr){
           ans.add(l1);
        }
        System.out.println("Printing list"+ans);
//        How to convert List to Array
        //Creating a List
        List<String>list=new ArrayList<String>();
    //Adding elements in the List
       list.add("Mango");
       list.add("Apple");
       list.add("Banana");
       list.add("Grapes");
        System.out.println("Printing list"+list);
        //Converting ArrayList to Array
        String[]arr1=list.toArray(new String[list.size()]);
        System.out.println("Printing arr"+Arrays.toString(arr1));
        System.out.println("Printing list"+list);



 }
}
