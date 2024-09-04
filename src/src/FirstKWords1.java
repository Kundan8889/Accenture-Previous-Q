import java.util.Scanner;

public class FirstKWords1 {
    public static String solve(String str,int k){
        String words[]=str.split(" +");
        if(k>str.length()){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(words[i]);
            if(i<k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string :");
        String x=sc.nextLine();
        System.out.println("Enter k no.");
        int k=sc.nextInt();
       String word= solve(x,k);
     System.out.println("new String:"+word);
    }
}
