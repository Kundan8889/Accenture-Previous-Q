import java.util.Scanner;

public class PrintEvenOdd {
//    public static String  solve(int arr[],int n){
//        if(n==0) return "";
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<n;i++){
//            int N=arr[i];
//            if(N%2==0){
//                sb.append("even ");
//            }
//            else{
//                sb.append("odd ");
//            }
//        }
//        return sb.toString();
//    }
public static String  solve(int arr[],int n){
    if(n==0) return "";
    String res="";
    for(int i=0;i<n;i++){
        int N=arr[i];
        if(N%2==0){
           res+="even ";
        }
        else{
            res+="odd ";
        }
    }
    return res;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array element are:");
       System.out.print(solve(arr,n));

    }
}
