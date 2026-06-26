import java.util.Scanner;

public class CountEveOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array");

        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int EveCount = 0;
        int OddCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                EveCount = EveCount + 1;
            } else {
                OddCount = OddCount + 1;
            }
        }
        System.out.println("Count of Odd numbers are " + OddCount);
        System.out.println("Count of Even numbers are " + EveCount);
    }
    
}
