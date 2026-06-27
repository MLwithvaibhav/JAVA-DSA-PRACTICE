import java.util.Scanner;
public class ZerosToEndOpt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Zeros to end 
        int j = 0;
        for(int i = 0; i<n; i++){
            if (arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            
        }
        while(j<n){
            arr[j] = 0;
            j++;
        }
        for(int i = 0; i<n; i++){
            System.out.println("The updated new array is " + arr[i] + " ");

        }
    }
    
}
