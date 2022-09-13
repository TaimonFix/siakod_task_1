import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

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
            int prev = 0, next = 0, k, cnt = 0;
            if (arr[i] == x)
                for (int j = i; j < arr.length - 1; j++) {
                    if (j == 0) {
                        prev = 0;
                        cnt++;
                    } else if (arr[j] != arr[j - 1]) {
                        prev = arr[j - 1];
                        cnt++;
                    }
                    if (j == arr.length - 1) {
                        next = 0;
                        cnt++;
                    } else if (arr[i] != arr[i + 1]) {
                        next = arr[i + 1];
                        cnt++;
                    }
                    if (cnt == 2) {
                        k = (next + prev) / 2;
                        arr[i] = k;
                        cnt = 0;
                    }

                }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
//        System.out.println("Input n: ");
        System.out.print("Input x: ");
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int x = scan.nextInt();
//        int[] arr = new int[n];
        int[] arr1 = {3, 2, 2, 5, 7};
        solution(arr1, x);
//        randArray(arr);
    }
}
