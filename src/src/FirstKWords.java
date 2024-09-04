import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstKWords {
    public static void solve(String str,int k ){
        String s[]=str.split(" +");
        List<String>ans=new ArrayList<>();
        k=Math.min(k,s.length);
        for(int i=0;i<k;i++){
            ans.add(s[i]);
        }
        for(String words:ans){
            System.out.println(words);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        solve(str,k);
    }
}
