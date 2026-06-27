import java.util.Scanner;
public class BinarySearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");

        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        // Binary Search 
        int low = 0;
        int high = n-1;
        int mid = (low+high)/2;
        
        while(low <= high){

            if(target == arr[mid]){
                System.out.println("Target element has been founded");
                return;
            }
            else if(target > arr[mid]){
                low = mid+1;
                mid = (low+high)/2;

            }else{
                high = mid-1;
                mid = (low+high)/2;
            }
            
            }
            System.out.println("Target element is not in the given array");


        }
    }
    

