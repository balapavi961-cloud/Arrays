import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        for(int i = 1;i<n;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
