import java.util.Scanner;

public class ElementAppearsOnce {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Finding the element that appears once;
        // Using Frequencies of elements in an array;

        int frequencies[] = new int[n+1];

        for(int i = 0; i<n; i++){
            int index = arr[i];
            frequencies[index] = frequencies[index]+1;
        }
        for(int i = 0; i<frequencies.length; i++){
            if (frequencies[i] == 1){
                System.out.println("The element that appears once is " + i);
            }
        }
        
    }
    
}
