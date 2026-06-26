import java.util.Scanner;
public class CheckSortArr {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Checking the array is sorted or not 
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                System.out.println("The array is not sorted");
                return;
            }
        }
        System.out.println("The array is sorted ");


    }
    
}
