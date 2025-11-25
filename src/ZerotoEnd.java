import java.util.Scanner;

public class ZerotoEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int[] a=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                a[index]=arr[i];
                index++;
            }
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
