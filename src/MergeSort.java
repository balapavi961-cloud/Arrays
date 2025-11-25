import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 3, 1, 2};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted Array : ");
        for(int num: arr){
            System.out.print(num+" ");
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low<high){
            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high - low+1];
        int k=0;
        int l=low;
        int r = mid+1;
        while(l<=mid && r<=high){
            if(arr[l]<= arr[r]){
                temp[k++]=arr[l];
                l++;
            }
            else {
                temp[k++]=arr[r];
                r++;
            }
        }
        while(l<= mid){
            temp[k++]=arr[l];
            l++;
        }
        while(r<=high){
            temp[k++]=arr[r];
            r++;
        }
        for(int i=0;i<temp.length;i++){
            arr[i+low]=temp[i];
        }
    }
}
