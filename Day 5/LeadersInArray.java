import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of an array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Leaders in an array

        int maxRight = 0;
        ArrayList<Integer> leaders = new ArrayList<>();

        maxRight = arr[n-1];
        leaders.add(maxRight);
        for (int i = n-1; i >= 0; i--) {
            
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }

        }
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.println(leaders.get(i));
        }
    }

}
