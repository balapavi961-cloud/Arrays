import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        System.out.println("Original Array :");
        System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);

        System.out.println("Sorted Array :");
        System.out.println(Arrays.toString(arr));
    }
    public static  void quickSort(int[] arr,int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static  int partition(int [] arr ,int low,int high){
        int piv = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while( i<=high && arr[i]<=piv ){
                i++;
            }
            while(j>=low && arr[j]>piv){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
}
