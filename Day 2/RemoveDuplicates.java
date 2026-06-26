import java.util.Scanner;
public class RemoveDuplicates {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");

        int n = sc.nextInt();
        
        System.out.println("Enter the elements of a sorted array ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Removing duplicates from an array 

        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1]){

            }else{
                System.out.println(arr[i]);
            }


        }System.out.println(arr[n-1]);
    }
    
}
