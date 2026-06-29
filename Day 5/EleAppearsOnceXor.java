import java.util.Scanner;

public class EleAppearsOnceXor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Fiding the element which has appeared only once by xor;
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor ^ arr[i];
        }
        System.out.println("The element that has only come once is " + xor);
    }
    
}
