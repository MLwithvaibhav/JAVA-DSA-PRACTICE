import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int j = 0;
        int reversal[] = new int[n];
        // Reversing an array;
        for(int i = n-1; i>=0; i--){
            reversal[j] = arr[i];
            j++; 
        }
        for(int i = 0; i<n; i++){
            System.out.println("Reversal of array is " + reversal[i]);

        }
        
    }
    
}
