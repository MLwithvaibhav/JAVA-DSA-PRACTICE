import java.util.Scanner;

public class MaxConsecOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Finding the Maximum consecutive ones;
        
        int count = 0;
        int MaxCount = 0;

        for(int i = 0; i<n; i++){
              if(arr[i] == 1){
                count++;
                if(MaxCount < count){
                    MaxCount = count;
                }
                
              }else {
                count = 0;
              }
        }
        System.out.println("The maximum consecutive ones of this array are " + MaxCount);
    }
    
}
