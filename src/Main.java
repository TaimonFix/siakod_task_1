import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] randArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void solution(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x)
                for (int j = i; j < arr.length - 1; i++) {
                    int prev = 0, next = 0, k = 0;
                    if (j == 0)
                        prev = 0;
                    else if (arr[j] != arr[j - 1])
                        prev = arr[j - 1];
                    if (j == arr.length - 1)
                        next = 0;
                    else if (arr[i] != arr[i + 1])
                        next = arr[i + 1];
                    k = (next + prev) / 2;
                    arr[i] = k;
                }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input n: ");
        System.out.print("Input x: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n];
        int[] arr1 = {1, 2, 2, 5, 5};
        solution(arr1, x);
        randArray(arr);
    }
}
