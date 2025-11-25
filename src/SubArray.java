import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        Arrays.sort(arr);
        int k= sc.nextInt();
        int[] sub = new int[k];
        int j=0;
        int i=n-1;
        while(j<k && i>=k){
            sub[j++]=arr[i--];
        }
        for(int num : sub){
            System.out.print(num+" ");
        }
    }
}
