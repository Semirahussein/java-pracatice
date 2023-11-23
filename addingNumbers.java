public class addingNumbers {
    public static void main(String[] args) {
        // using for loop
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.print("the sum of the numbers 1 to 100 is : " + sum);

        // using while loop

        int i = 0;
        while (i <= 100) {
            sum += i;
            i++;

        }
        System.out.print("the sum of the numbers 1 to 100 is : " + sum);

        // using do while loop
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.print("the sum of the numbers 1 to 100 is : " + sum);

    }
}