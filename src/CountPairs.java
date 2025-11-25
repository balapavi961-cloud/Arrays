import java.util.Scanner;

public class CountPairs {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;arr[i++]=sc.nextInt());
        int sum=sc.nextInt();
        int count=0;
        for(int i=0;i<s;i++){
            for(int j=1;j<s-1;j++){
                if(arr[i]+arr[j]==sum) count++;
            }
        }
        System.out.println(count);
    }

}
