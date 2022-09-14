import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void randArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1);
//            System.out.print(arr[i] + " ");
        }
    }
    public static void solution(int[] arr, int x, int n) {
        long start = System.currentTimeMillis();
        int prev = 0, next = 0, k = 0;
        boolean prevFlag = false, nextFlag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                for (int j = i; j < arr.length; j++) {
                    if (j == 0) {
                        prev = 0;
                        prevFlag = true;
                    } else if (arr[j] != arr[j - 1]) {
                        prev = arr[j - 1];
                        prevFlag = true;
                    }
                    if (j == arr.length - 1) {
                        next = 0;
                        nextFlag = true;
                    } else if (arr[i] != arr[i + 1]) {
                        next = arr[i + 1];
                        nextFlag = true;
                    }
                    if (nextFlag && prevFlag) {
                        k = (prev + next) / 2;
                        break;
                    }
                }
                if (nextFlag && prevFlag) {
                    arr[i] = k;
                    prevFlag = false;
                    nextFlag = false;
                }
            }
        }
//        printArray(arr);
        System.out.println();

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Количество входных данных: " + n);
        System.out.println("Прошло времени, мс: " + elapsed);

    }

    public static void main(String[] args) {
        System.out.print("Input n: ");
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int n = 1000;
        int[] arr1 = new int[n];
        randArray(arr1);
        solution(arr1, x, n);

        n = 5000;
        int[] arr2 = new int[n];
        randArray(arr2);
        solution(arr2, x, n);

        n = 10000;
        int[] arr3 = new int[n];
        randArray(arr3);
        solution(arr3, x, n);

        n = 20000;
        int[] arr4 = new int[n];
        randArray(arr1);
        solution(arr4, x, n);

        n = 30000;
        int[] arr5 = new int[n];
        randArray(arr1);
        solution(arr5, x, n);

        n = 40000;
        int[] arr6 = new int[n];
        randArray(arr1);
        solution(arr6, x, n);

    }
}
