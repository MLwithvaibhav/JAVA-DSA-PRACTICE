import java.util.Scanner;
public class ZerosToEnd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Moving all zeroes to end 
        int counter = 0;
        int NewArr[] = new int[n];
        int j = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                counter = counter + 1;
                
            }else (arr[i] != 0){
                NewArr[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i<counter; i++){
            NewArr[j] = 0;
            j++;
        }

        for(int i = 0; i < n; i++){
            System.out.print(NewArr[i] + " ");
        }

    }
    
}
