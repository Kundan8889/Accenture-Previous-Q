import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;
//public class LnkeHash {
//    public static void main(String args[]){
//        LinkedHashSet<String>lhs=new LinkedHashSet<>();
//        lhs.add("Java");
//        lhs.add("T");
//        lhs.add("Point");
//        lhs.add("Good");
//        lhs.add("Website");
//        System.out.println(lhs.remove("T"));
//        Iterator<String>st= lhs.iterator();;
//        while (st.hasNext()){
//            System.out.println(st.next());
//        }
//    }
//}

    class Book{
        int id;
        String name,author,publiser;
        int quantity;
    public Book(int id,String name,String author,String publiser,int quantity){
        this.id=id;
        this.author=author;
        this.name=name;
        this.publiser=publiser;
        this.quantity=quantity;
    }
    }
        public class LnkeHash {
    public static void main(String args[]){
        LinkedHashSet<Book>lhs=new LinkedHashSet<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        lhs.add(b1);
        lhs.add(b2);
        lhs.add(b3);
        for(Book b:lhs){
            System.out.println(b.id+b.name+b.author+b.publiser+b.quantity);
        }

    }
}
