import java.util.Scanner;
public class FindMissingElemArray {
    public static int  solve(int arr[],int n){
        int n1=n+1;
        int totalSum=n1*(n1+1)/2;
        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }
        int ans=totalSum-actualSum;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("Missing no:"+solve(arr,n));
    }
}
