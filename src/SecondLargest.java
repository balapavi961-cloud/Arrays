import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int max=Arrays.stream(arr).max().getAsInt();
        int smax=0;
        for(int i=0;i<n;i++) {
            if (smax < arr[i] && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
