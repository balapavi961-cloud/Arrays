import java.util.Scanner;

public class ConsecutiveNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
//        int[] a = new int[n];
//        int k=0;
//        for(int i=1;i<n;i++){
//           int x=0+i;
//           a[k++]=x;
//        }
        int k=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=k){
                System.out.println(k);
                break;
            }
            k++;
        }
//        for(int num : a){
//            System.out.print(num+" ");
//        }
    }
}
