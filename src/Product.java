import java.util.Scanner;

public class Product {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int[] num=new int[n];

        for(int i=0;i<n;i++){
            int mul=1;
            for(int j=0;j<n;j++){
                if(j != i){
                    mul=mul*arr[j];
                }
            }
            num[i]=mul;
        }
        for(int nums : num){
            System.out.print(nums+" ");
        }
    }
}
