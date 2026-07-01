import java.util.Scanner;

public class RearrangeBySign {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Rearranging by signs of elements ;

        int Result[] = new int[n];
        int pos = 0;
        int neg = 1;

        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                Result[pos] = arr[i];
                pos = pos + 2;
            } else if (arr[i] < 0){
                Result[neg] = arr[i];
                neg = neg + 2;
            }
        }
        for(int i = 0; i<n; i++){
            System.out.println("The desired array is " + Result[i]);
        }
        
    }





    
}
