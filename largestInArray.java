import java.util.Scanner;

class largesrInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        System.out.println("how many numbers?");

        int n = scan.nextInt();
        int[] arr;
        arr = new int[100];
        System.out.println("enter the numbers.");

        for (int i = 0; i <= 4; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i <= 4; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the largest in the array is :" + max);

    }
}