import java.util.Scanner;

public class UnionOfArr {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of first array");
        int A[] = new int[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array");
        int n1 = sc.nextInt();

        System.out.println("Enter the elements of second array");
        int B[] = new int[n1];
        for(int i = 0; i<n1; i++){
            B[i] = sc.nextInt();
        }

        // Union of Two Sorted arrays;

        int i = 0;
        int j = 0;

        // n1 = size of A
        // n2 = size of B
        while (i < n && j < n1) {

             if(i > 0 && A[i] == A[i-1]){
                i++;
                continue;
            }

            if(j > 0 && B[j] == B[j-1]){
                j++;
                continue;
            }

            if(A[i] < B[j]){
                System.out.println(A[i]);
                i++;
            } else if(A[i] == B[j]){
                System.out.println(B[j]);
                i++;
                j++;
            } else {
                System.out.println(B[j]);
                j++;
            }
            
        }

        while (i<n) {
            System.out.println(A[i]);
            i++;
            
        }

        while(j<n1){
            System.out.println(B[j]);
            j++;
        }


    }
    
}
