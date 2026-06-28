import java.util.Scanner;

public class IntersectionOfArr {

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


        // Intersection of Two sorted arrays;

        int i = 0;
        int j = 0;

        while (i<n && j<n1) {
            if(A[i] < B[j]){
                i++;
            } else if(A[i] == B[j]){
                System.out.println(A[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }
    
}
