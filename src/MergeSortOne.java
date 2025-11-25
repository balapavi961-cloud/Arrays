import java.util.Scanner;

public class MergeSortOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());

        mergesort(arr,0,arr.length-1);

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void mergesort(int[] arr, int low, int high)
    {
        if(low<high){
            int mid = (low + high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr , int low , int mid, int high)
    {
        int[] temp = new int[high-low+1];
        int k=0;
        int l=low;
        int h=mid+1;
        while(l<=mid && h<=high){
            if(arr[l]<arr[h]){
                temp[k++]=arr[l++];
            }
            else{
                temp[k++]=arr[h++];
            }
        }
        while(l<=mid){
            temp[k++]=arr[l++];
        }
        while(h<=high){
            temp[k++]=arr[h++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
}
