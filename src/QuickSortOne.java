import java.util.Scanner;

public class QuickSortOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());

        quicksort(arr,0,arr.length-1);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void quicksort(int[] arr,int low,int high)
    {
        if(low<high){
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high)
    {
        int piv = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && arr[i]<=piv){
                i++;
            }
            while(j>=low && arr[j]>piv){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }

}
