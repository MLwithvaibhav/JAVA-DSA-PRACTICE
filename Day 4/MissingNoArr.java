import java.util.Scanner;

public class MissingNoArr {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of N");
        int N = sc.nextInt();


        System.out.println("Enter the elements of an array");
        int arr[] = new int[N-1];
        for(int i = 0; i<N-1; i++){
            arr[i] = sc.nextInt();
        }

        // Missing Number in an array;
        int sum = 0;
        int ArrSum = 0;
        
        for(int i = 1; i<=N; i++){
            sum = sum + i;


        }
        for(int i = 0; i<arr.length; i++){
            ArrSum = ArrSum + arr[i];

        }
        int FinalResult = sum - ArrSum;
        System.out.println("The final missing number is " + FinalResult);
    }
    
}
