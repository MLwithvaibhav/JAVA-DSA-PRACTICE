import java.util.Scanner;
public class FirstAndLastOcc{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        // Checking the first and last occurences of targeted element in an array

        int first = -1;
        int last = -1;

        for(int i = 0; i<n; i++){
            if(target == arr[i]){
                if( first == -1){
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("The first occurence of targeted element is " + first);
        System.out.println("The last occurence of targeted element is " + last);
        
    }
    
}
