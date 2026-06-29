import java.util.Scanner;
public class MoveZeroesSwap {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        // Moving zeroes to end by swapping; (Optimal solution)
        int j = -1;
        
        for(int k = 0; k<n; k++){
            if(arr[k] == 0){
                 j = k;
                break;
            } else if(j == -1){
                System.out.println("This array has noo zeroes......Kindly update your array");
                return;
            }
        }

        int i = j+1;
        while (i<n) {
            if(arr[i] == 0){
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
        }
        for(int x = 0; x<n; x++){
            System.out.println("The desired array is " + arr[x]);
        }

        
    }
    
}
