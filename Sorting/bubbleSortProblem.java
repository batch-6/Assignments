import java.io.;
import java.util.;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        buubleSort(arr);

        for(int i=0;i<n;i++){
            if(i==0){
               System.out.println("First Element: "+arr[0]);
            }
            if(i==n-1){
                System.out.println("Last Element: "+arr[n-1]); 
            }
        }

    }
    static void buubleSort(int[] arr){
        boolean flag= false;
        int n =arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            flag =false;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){ // compare
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =true;
                    count++;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println("Array is sorted in "+count+" swaps.");

    }
}