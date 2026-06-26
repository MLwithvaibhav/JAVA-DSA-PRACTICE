import java.util.Scanner;
public class FrequencyOfEle {

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

        // Finding frequency of an elements ;
        int counter = 0;
        for(int i = 0; i<n; i++){
            if(target == arr[i]){
                counter = counter + 1;
            }
        }
        System.out.println("The frequency of this target element is " + counter);

    }
    
}
